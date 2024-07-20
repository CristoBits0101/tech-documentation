package com.cristobits0101.exceptions.exceptions.controllers;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cristobits0101.exceptions.exceptions.exceptions.UserNotFoundException;

@RestControllerAdvice
public class HandlerExceptionControllerNull {

    /**
     * 1. Para exceptions de atributos no inicializados.
     * 2. Para cuando se devuelve un null en el JSON.
     */
    @ExceptionHandler({NullPointerException.class, HttpMessageNotWritableException.class, UserNotFoundException.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String, Object> handleNumberFormatException(NumberFormatException e) {
        Map<String, Object> error = new HashMap<>();
        error.put("error", "El usuario o rol no existe.");
        error.put("message", e.getMessage());
        error.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        error.put("date", new Date().toString());
        return error;
    }
    
}
