package com.uni_educare.exceptionHandler;

import com.uni_educare.UniEducareApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionEntity> handleGeneralException(Exception exception){
        return new ResponseEntity<ExceptionEntity>(new ExceptionEntity(exception.getMessage(), LocalDateTime.now(), 400), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(UniEducareException.class)
    public ResponseEntity<ExceptionEntity> handleUniEducareException(UniEducareException uniEducareException){
        return new ResponseEntity<ExceptionEntity>(new ExceptionEntity(uniEducareException.getMessage(), LocalDateTime.now(), 400), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
