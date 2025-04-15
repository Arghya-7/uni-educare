package com.uni_educare.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.springframework.test.util.AssertionErrors.assertTrue;

@ExtendWith(MockitoExtension.class)
public class DashBoardControllerTest {
    @InjectMocks
    DashboardController dashboardController;

    @Test
    public void dashboardPageTest(){
        assertTrue("Test passed", dashboardController.dashboardPage().getBody() != null);
    }

}
