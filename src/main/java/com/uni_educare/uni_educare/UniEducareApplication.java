package com.uni_educare.uni_educare;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UniEducareApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(UniEducareApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(UniEducareApplication.class, args);
		LOGGER.info("Project started");
	}

}
