package com.example.demo.exception;

/**
 * @author zdz
 * @create 2018-06-07-14:43
 */

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

public class CustomizedResponseEntityExceptionHandler {

    @ExceptionHandler(MetaDataNotFoundException.class)
    public final ResponseEntity<Object> handleUserNotFountException(MetaDataNotFoundException ex, WebRequest request) {


        ExceptionResponse exceptionResponse =
                new ExceptionResponse(new Date(), ex.getMessage(),request.getDescription(false));

        return new ResponseEntity(exceptionResponse, HttpStatus.NOT_FOUND);
    }
}