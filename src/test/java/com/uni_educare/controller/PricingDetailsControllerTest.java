package com.uni_educare.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.uni_educare.module.PriceVO;
import com.uni_educare.service.PriceService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.util.AssertionErrors.assertNotNull;


@ExtendWith(MockitoExtension.class)
public class PricingDetailsControllerTest {

    @Mock
    PriceService priceService;

    @InjectMocks
    PricingDetailsController pricingDetailsController;

    @Test
    public void testSaveData(){
        doNothing().when(priceService).setPrice(Mockito.any());
        assertTrue(pricingDetailsController.save(new PriceVO()) != null);
    }

    @Test
    public void testGetList() throws JsonProcessingException {
        when(priceService.getBatchDetails()).thenReturn(Arrays.asList(new PriceVO()));
        assertTrue(pricingDetailsController.getList() != null);
    }
}
