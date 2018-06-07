package com.example.demo.exception;

/**
 * @author zdz
 * @create 2018-06-07-14:40
 */

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MetaDataNotFoundException extends RuntimeException {
    public MetaDataNotFoundException() {

    }

    public MetaDataNotFoundException(String s) {
        super(s);
    }
}
