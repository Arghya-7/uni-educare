package com.uni_educare.uni_educare.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/uni-educare/")
public class DashboardController {
    @GetMapping("/dashboard")
    public ResponseEntity<String> dashboardPage(){
        return new ResponseEntity<String>("Hello Learners! we serve best quality education", HttpStatus.OK);
    }
}
