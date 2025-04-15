package com.uni_educare.configaration;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ModelMapperConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(ModelMapperConfig.class);
    @Bean
    public ModelMapper modelMapper(){
        LOGGER.info("Created bean of modelMapper");
        return new ModelMapper();
    }
}
