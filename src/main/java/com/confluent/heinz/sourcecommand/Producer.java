package com.confluent.heinz.sourcecommand;

import io.confluent.developer.InterceptTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.kafka.core.KafkaTemplate;


@Service
@CommonsLog(topic = "Producer Logger")
public class Producer {

        private int counter = 0;

        @Value("${topic.name: testTopic}")
        private String TOPIC;

        private final KafkaTemplate<String, InterceptTest> kafkaTemplate;

        @Autowired
        public Producer(KafkaTemplate<String, InterceptTest> kafkaTemplate) {
            this.kafkaTemplate = kafkaTemplate;
        }

        void sendMessage(InterceptTest iTest) {
            counter = counter +1;
            int custKey = iTest.getReqCustid() + counter;

            //this.kafkaTemplate.send(this.TOPIC, iTest.getReqCustid().toString(), iTest);
            this.kafkaTemplate.send(this.TOPIC, String.valueOf(custKey), iTest);
            log.info(String.format("Produced AVRO message -> %s", iTest));
        }


}
