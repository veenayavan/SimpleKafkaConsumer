package com.app.simpe.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaTestListener {

    @KafkaListener(topics = "test-topic", groupId = "test")
    public void consume(String message) {
        System.out.println("consumed message : " + message);
    }
}
