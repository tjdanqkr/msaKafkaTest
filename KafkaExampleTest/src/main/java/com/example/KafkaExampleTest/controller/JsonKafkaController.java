package com.example.KafkaExampleTest.controller;

import com.example.KafkaExampleTest.kafka.JsonKafkaProducer;
import com.example.KafkaExampleTest.payload.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonKafkaController {
    private JsonKafkaProducer kafkaProducer;
    public JsonKafkaController(JsonKafkaProducer kafkaProducer){
        this.kafkaProducer = kafkaProducer;
    }
    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user){

        kafkaProducer.sendMessage(user);
        return ResponseEntity.ok("message");

    }
}
