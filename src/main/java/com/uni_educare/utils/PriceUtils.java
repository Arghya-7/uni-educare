package com.uni_educare.utils;

import com.uni_educare.module.Price;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class PriceUtils {
    @Autowired
    ModelMapper modelMapper;

    public List<Price> convertToList(List<?> objects){
        List<Price> prices = new ArrayList<>();
        if(objects instanceof List<?>){
            for(Object object: (List<?>)objects){
                prices.add(modelMapper.map(object, Price.class));
            }
        }
        return prices;
    }
}
