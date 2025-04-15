package com.uni_educare.exceptionHandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionEntity {
    String message;
    LocalDateTime localDateTime;
    int statusCode;
}
