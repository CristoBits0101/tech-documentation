package com.example.demo.h_exceptions.hb_controller.hbb_advice.hbbb_modular;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class HBBB_ParseExceptionStatus500 {

    // Captura errores al pasear
    @ExceptionHandler(NumberFormatException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) // Para variar retornamos un map y anotamos el tipo de respuesta
    public  Map<String, Object> numberFormatException(NumberFormatException e) {

        Map<String, Object> error = new HashMap<>();
        
        error.put("date", new Date());
        error.put("error", "numero invalido o incorrecto, no tiene formato de digito!");
        error.put("message", e.getMessage());
        error.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());

        return error;

    }

}
