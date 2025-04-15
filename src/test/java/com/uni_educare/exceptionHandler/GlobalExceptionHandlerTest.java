package com.uni_educare.exceptionHandler;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static org.mockito.Mockito.when;
import static org.springframework.test.util.AssertionErrors.assertTrue;

@ExtendWith(MockitoExtension.class)
public class GlobalExceptionHandlerTest {
    @InjectMocks
    GlobalExceptionHandler globalExceptionHandler;

    @Test
    public void handleGeneralExceptionTest(){
        assertTrue("Test passed", globalExceptionHandler.handleGeneralException(new Exception()).getBody() != null);
    }

    @Test
    public void handleUniEducareExceptionTest(){
        assertTrue("Test passed", globalExceptionHandler.handleUniEducareException(new UniEducareException("abcd")).getBody() != null);
    }
}
