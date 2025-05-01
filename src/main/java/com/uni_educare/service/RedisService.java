package com.uni_educare.service;

public interface RedisService {
    public void setValue(String key, Object value);
    public <T> T getValue(String key);
}
