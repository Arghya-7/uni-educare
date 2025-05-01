package com.uni_educare.service.Impl;

import com.uni_educare.repositary.PriceRepository;
import com.uni_educare.service.RedisService;
import com.uni_educare.utils.PriceUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import static org.mockito.Mockito.doNothing;

@ExtendWith(MockitoExtension.class)
public class PriceServiceImplTest {
    @Mock
    RedisService redisService;

    @Mock
    PriceRepository priceRepository;

    @Mock
    ModelMapper modelMapper;

    @Mock
    PriceUtils priceUtils;

//    @Test
//    public void testSetPrice(){
//        doNothing().when(priceRepository).save(Mockito.any());
//    }

}
