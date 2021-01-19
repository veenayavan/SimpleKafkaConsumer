package com.app.simpe.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class KafkaConsumerMain {

    public static void main(String[] args) {
        SpringApplication.run(KafkaConsumerMain.class);
    }
}
