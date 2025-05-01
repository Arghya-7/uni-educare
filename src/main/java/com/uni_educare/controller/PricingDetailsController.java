package com.uni_educare.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.uni_educare.module.PriceVO;
import com.uni_educare.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.uni_educare.constant.UniEducareConstant.PRICING_CONTROLLER;

@RestController
@RequestMapping(PRICING_CONTROLLER)
public class PricingDetailsController {
    @Autowired
    PriceService priceService;

    ObjectMapper objectMapper = new ObjectMapper();

    @PostMapping("/saveData")
    public ResponseEntity<ObjectNode> save(@RequestBody PriceVO priceVO){
        priceService.setPrice(priceVO);
        ObjectNode objectNode = objectMapper.createObjectNode();
        objectNode.put("message","Data created successfully");
        return ResponseEntity.ok(objectNode);
    }

    @GetMapping("/getList")
    public ResponseEntity<List<PriceVO>> getList() throws JsonProcessingException {
        return new ResponseEntity<>(priceService.getBatchDetails(), HttpStatus.OK);
    }
}
