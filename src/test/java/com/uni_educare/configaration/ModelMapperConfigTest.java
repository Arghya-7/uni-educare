package com.uni_educare.configaration;

import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.springframework.test.util.AssertionErrors.assertNotNull;

@SpringBootTest
@ContextConfiguration(classes = ModelMapperConfig.class)
public class ModelMapperConfigTest {
    @Autowired
    ModelMapper modelMapper;

    @Test
    void modelMapperTest(){
        assertNotNull("Should not be null", modelMapper);
    }
}
