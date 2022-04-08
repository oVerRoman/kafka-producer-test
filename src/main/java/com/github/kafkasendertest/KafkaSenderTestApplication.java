package com.github.kafkasendertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaSenderTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaSenderTestApplication.class, args);
		System.out.println("Kafka-sender starts");
	}
}
