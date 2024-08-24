package com.org.tcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@EnableAutoConfiguration
@SpringBootApplication
public class MongoDbProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDbProjectApplication.class, args);
	}

}
