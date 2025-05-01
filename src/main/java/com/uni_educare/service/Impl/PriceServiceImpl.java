package com.uni_educare.service.Impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.uni_educare.configaration.CacheConfigaration;
import com.uni_educare.module.Price;
import com.uni_educare.module.PriceVO;
import com.uni_educare.repositary.PriceRepository;
import com.uni_educare.service.PriceService;
import com.uni_educare.service.RedisService;
import com.uni_educare.utils.PriceUtils;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class PriceServiceImpl implements PriceService {

    @Autowired
    RedisService redisService;

    @Autowired
    PriceRepository priceRepository;

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    PriceUtils priceUtils;

    ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void setPrice(PriceVO price) {
        log.info("Started method setPrice..  payload {}", price);
        Price priceEntity = modelMapper.map(price, Price.class);
        priceRepository.save(priceEntity);
        redisService.setValue("price-cache-table", priceRepository.findAll());
    }

    @Override
    public List<PriceVO> getBatchDetails() throws JsonProcessingException {
        log.info("Started method getBatchDetails");
        Object result = redisService.getValue("price-cache-table");
        if(result == null){
            redisService.setValue("price-cache-table", priceRepository.findAll());
            result = redisService.getValue("price-cache-table");
        }
        List<Price> prices = priceUtils.convertToList((List<?>) result);
        List<PriceVO> priceVOS = prices.stream()
                .map(item -> modelMapper.map(item, PriceVO.class))
                .collect(Collectors.toList());
        return priceVOS;
    }
}
