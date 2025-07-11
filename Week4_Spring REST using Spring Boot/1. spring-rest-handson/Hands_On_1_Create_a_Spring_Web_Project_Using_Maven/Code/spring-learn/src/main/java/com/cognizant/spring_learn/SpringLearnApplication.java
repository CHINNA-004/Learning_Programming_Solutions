package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearnApplication {

	// ✅ Add a logger instance
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
		// ✅ Log before Spring Boot starts
		LOGGER.info("START");
		SpringApplication.run(SpringLearnApplication.class, args);
		// ✅ Log after Spring Boot has started
		LOGGER.info("END");
	}
}
