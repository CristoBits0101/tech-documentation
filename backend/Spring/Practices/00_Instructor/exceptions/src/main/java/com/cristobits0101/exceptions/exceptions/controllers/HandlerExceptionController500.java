package com.cristobits0101.exceptions.exceptions.controllers;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cristobits0101.exceptions.exceptions.models.Error;

@RestControllerAdvice
public class HandlerExceptionController500 {

    /**
     * El símbolo de ? indica que se puede devolver cualquier tipo.
     * La anotación hace que cuando se dispare una excepción se ejecute el método.
     * Ahora no daría error en el navegador al ejecutar la petición.
     * 
     * @param e
     * @return ?
     */
    // @ExceptionHandler(ArithmeticException.class)
    // public ResponseEntity<?> divisionByZero(ArithmeticException e) {
    // return ResponseEntity.internalServerError().body("Error 500");
    // }

    /**
     * Ejemplo 2
     * 
     * @param e
     * @return
     */
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<Error> divisionByZero(ArithmeticException e) {
        Error error = new Error();
        error.setDate(new Date());
        error.setError("Error al dividir por cero!");
        error.setMessage(e.getMessage());
        error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        /**
         * ResponseEntity para manejar respuestas HTTP.
         * internalServerError() método de ResponseEntity que crea un 500.
         * body() Para devolver un body al usuario de la petición.
         * Ejemplo de retorno válido.
         */
        // return ResponseEntity
        // .internalServerError()
        // .body(error);

        /**
         * Alternativa de retorno.
         * Status para alternar variaciones de errores.
         */
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(error);
    }
}
