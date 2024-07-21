package com.cristobits0101.exceptions.exceptions.controllers;

import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandlerExceptionControllerParse {

    /**
     * Con Map devolvemos ResponseStatus.
     * Porque no retorna un ResponseEntity para HTTP con el error.
     * Aquí el status es una respuesta y no un método de ResponseEntity.
     */
    @ExceptionHandler(NumberFormatException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String, Object> handleNumberFormatException(NumberFormatException e) {
        Map<String, Object> error = new HashMap<>();
        error.put("error", e.getMessage());
        error.put("message", e.getMessage());
        error.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        error.put("date", new Date().toString());
        return error;
    }
    
}
