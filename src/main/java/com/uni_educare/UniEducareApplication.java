package com.uni_educare;

import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.Collections;

@SpringBootApplication
public class UniEducareApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(UniEducareApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(UniEducareApplication.class, args);
		LOGGER.info("Active Profiles: {} ", Arrays.toString(context.getEnvironment().getActiveProfiles()));
		LOGGER.info("Started Application : {}", context.getEnvironment().getProperty("spring.application.name"));
	}

}
