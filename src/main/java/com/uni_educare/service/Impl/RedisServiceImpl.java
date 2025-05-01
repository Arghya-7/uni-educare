package com.uni_educare.service.Impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.uni_educare.service.RedisService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class RedisServiceImpl implements RedisService {
    @Autowired
    RedisTemplate<String, Object> redisTemplate;

    ObjectMapper objectMapper = new ObjectMapper();


    @Override
    public void setValue(String key, Object value) {
        redisTemplate.opsForValue().set(key, value, 6000, TimeUnit.SECONDS);
    }

    @Override
    public Object getValue(String key) {
        Object result = redisTemplate.opsForValue().get(key);
        return result;
    }
}
