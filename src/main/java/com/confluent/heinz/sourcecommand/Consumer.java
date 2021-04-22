package com.confluent.heinz.sourcecommand;

import io.confluent.developer.InterceptTest;
import lombok.extern.apachecommons.CommonsLog;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@CommonsLog(topic = "Consumer Logger")
public class Consumer {

    //Consume the Kafka emessage
    @KafkaListener(topics = "#{'${spring.kafka.topics}'.split(',')}", groupId = "${spring.kafka.consumer.group-id:app}")
    public void consume(ConsumerRecord<Integer, InterceptTest> record) {
        log.info(String.format("Consumed message -> %s with key => %s" , record.value(), record.key()));
    }

}
