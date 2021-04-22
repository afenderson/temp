package com.confluent.heinz.sourcecommand;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.confluent.developer.InterceptTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.net.URISyntaxException;

import java.net.URI;

import java.util.Enumeration;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping(value = "/test")
public class RESTController {
    private final Producer producer;

    //Actual Microserver listening port
    @Value("${server.port}")
    private String PORT;

    @Autowired
    RESTController(Producer producer) {
        this.producer = producer;
    }

    //Path of http://host/test/interceptor is the entry point to POST a JSON file
    @PostMapping(value = "/interceptor",
            consumes = {MediaType.APPLICATION_JSON_VALUE,},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity interceptor(@RequestBody com.confluent.heinz.sourcecommand.Testrequest request,
                                      HttpServletRequest httpRequest) throws URISyntaxException {

        System.out.println("Original Request First Name: " + request.getFirstName() );
        System.out.println("Original Request Last Name: " + request.getLastName() );
        System.out.println("Original Request CustomerID: " + request.getCustomerId() );
        System.out.println("JSON Request: " + request.toString() );

        String JsonStr = "";
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonStr = mapper.writeValueAsString(request);
        } catch (JsonProcessingException je){
            System.out.println("JSON Error: \n:");
            je.printStackTrace();
        }
        System.out.println("JSON Request: " + JsonStr);


        //location for the interceptor to POST the actual service
        String redirectUrl = "http://localhost:" + PORT + "/test/microservices";

        RestTemplate restTemplate = new RestTemplate();
        URI uri = new URI(redirectUrl);

        //recreate headers from intercepted POST to forward to original service
        HttpHeaders headers = new HttpHeaders();
        Enumeration<String> testEnum = httpRequest.getHeaderNames();
        while (testEnum.hasMoreElements()) {
            String name = testEnum.nextElement();
            System.out.println("\t" + name + ":" + httpRequest.getHeader(name));
            headers.set(name,httpRequest.getHeader(name));
        }

        //Get response from posting to the original service using details from this interceptor POST
        ResponseEntity<com.confluent.heinz.sourcecommand.Testrequest> result = restTemplate.postForEntity(uri, request, com.confluent.heinz.sourcecommand.Testrequest.class);
        System.out.println("Result" + result);

        //Convert JSON response from original to a more efficient AVRO messages from JSON response to send to Kafka
        InterceptTest iTest = new InterceptTest();
        iTest.setReqCustid(request.getCustomerId());
        System.out.println("Headers: " + headers.toString());
        iTest.setReqHeaders(headers.toString());
        iTest.setReqJson(JsonStr);
        iTest.setReqMessage(request.toString());
        iTest.setReqMethod(httpRequest.getMethod());
        iTest.setReqRemoteAddr(httpRequest.getRemoteAddr());
        iTest.setReqUri(httpRequest.getRemoteAddr());
        String JsonStrResult = "";
        ObjectMapper mapperResult = new ObjectMapper();
        try {
            JsonStrResult = mapperResult.writeValueAsString(result);
        } catch (JsonProcessingException je){
            System.out.println("JSON Error: \n:");
            je.printStackTrace();
        }
        iTest.setResultJson(JsonStrResult);
        iTest.setResultPost(result.toString());

        //Send AVRO message to Kafka
        producer.sendMessage(iTest);

        return result;
    }


    //Acts as the Original Microservice
    @PostMapping(value = "/microservices",
            consumes = {MediaType.APPLICATION_JSON_VALUE,},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity microservice(@RequestBody com.confluent.heinz.sourcecommand.Testrequest request, HttpServletRequest httpRequest) throws URISyntaxException {
        if (request == null) {
            return ResponseEntity.noContent().build();
        } else {
            URI uri = new URI(httpRequest.getRequestURL().toString());
            return ResponseEntity.created(uri).body(request);
        }
    }

    //Just a test to check details from the POST of a JSON message
    @PostMapping("/test")
    public ResponseEntity test(@RequestBody com.confluent.heinz.sourcecommand.Testrequest testRequest, HttpServletRequest request ) {
        System.out.println("Message Received:\n" + testRequest.toString());
        System.out.println("Remote: " + request.getRemoteAddr());
        System.out.println("Request: " + request.getRequestURI());
        System.out.println("Headers: ");
        Enumeration<String> testEnum = request.getHeaderNames();
        while (testEnum.hasMoreElements()) {
            String name = testEnum.nextElement();
            System.out.println("\t" + name + ":" + request.getHeader(name));
        }
        System.out.println("Method: " + request.getMethod());
        System. out.println("Request: " + request.getScheme());

        return ResponseEntity.ok("Got it");
    }



}
