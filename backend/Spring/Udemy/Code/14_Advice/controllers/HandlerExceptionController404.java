package com.cristobits0101.exceptions.exceptions.controllers;

import java.util.Date;

import javax.naming.NameNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.cristobits0101.exceptions.exceptions.models.Error;

@RestControllerAdvice
public class HandlerExceptionController404 {

    // Error es el body de la respuesta en el JSON
    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<Error> notFoundException(NameNotFoundException e) {

        /**
         * Se podría usar un hash map no tiene porque ser un objeto.
         * NOT_FOUND es un enum constante.
         * Devuelve siempre 404.
         */
        Error error = new Error();

        error.setDate(new Date());
        error.setError("Error 404: Api rest no encontrado.");
        error.setMessage(e.getMessage());
        error.setStatus(HttpStatus.NOT_FOUND.value());

        return ResponseEntity.status(401).body(error);

    }

}
