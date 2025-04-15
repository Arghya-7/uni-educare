package com.uni_educare.exceptionHandler;

import com.uni_educare.UniEducareApplication;

public class UniEducareException extends RuntimeException{
    UniEducareException(String exception){
        super(exception);
    }
}
