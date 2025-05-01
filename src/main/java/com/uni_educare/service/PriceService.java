package com.uni_educare.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.uni_educare.module.PriceVO;

import java.util.List;

public interface PriceService {
    public void setPrice(PriceVO price);
    public List<PriceVO> getBatchDetails() throws JsonProcessingException;
}
