package com.example.KafkaExampleTest.kafka;


import com.example.KafkaExampleTest.payload.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JsonKafkaConsumer {
    @KafkaListener(topics = "javaGuides" , groupId = "myGroup")
    public void consume(User message){
        log.info(String.format("Message Received -> %s", message.toString()));
    }
}
