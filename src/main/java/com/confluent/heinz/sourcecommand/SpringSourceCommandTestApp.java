package com.confluent.heinz.sourcecommand;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSourceCommandTestApp {

    @Value("${topic.name}")
    private String topicName;

    @Value("${topic.partitions-num}")
    private Integer partitions;

    @Value("${topic.replication-factor}")
    private short replicationFactor;

    public static void main(String[] args) {
        SpringApplication.run(SpringSourceCommandTestApp.class, args);
    }

}
