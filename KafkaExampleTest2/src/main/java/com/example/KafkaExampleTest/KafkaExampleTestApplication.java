package com.example.KafkaExampleTest;

import com.example.KafkaExampleTest.config.ChangeProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaExampleTestApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(KafkaExampleTestApplication.class, args);
	}
	@Autowired
	private ChangeProducer changeProducer;
	@Override
	public void run(String... args) throws Exception {
		changeProducer.sendMessage();
	}
}
