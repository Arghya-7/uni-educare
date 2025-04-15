package com.uni_educare.controller;

import com.uni_educare.configaration.ModelMapperConfig;
import com.uni_educare.constant.UniEducareConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.uni_educare.constant.UniEducareConstant.DASHBOARD;
import static com.uni_educare.constant.UniEducareConstant.DASHBOARD_CONTROLLER;

@RestController
@RequestMapping(DASHBOARD_CONTROLLER)
public class DashboardController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DashboardController.class);

    @GetMapping(DASHBOARD)
    public ResponseEntity<String> dashboardPage(){
        LOGGER.info("Started controller {}","dashboardPage");
        return new ResponseEntity<String>("Hello Learners! we serve best quality education", HttpStatus.OK);
    }
}
