package com.example.demo.h_exceptions.hb_controller.hbb_advice.hbbb_modular;

import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.h_exceptions.hb_controller.hbb_advice.hbbc_exception.HBBCA_UserNotFoundException;

@ControllerAdvice
public class HBBC_NullPointerException500 {

    // 
    /**
     * Si se llama a un objeto null o a las propiedades de este
     * Si la propiedad del objeto no está inicializada
     * LA TERCERA EXCEPTION HANDLER MAPEA UNA CLASE
     */
    @ExceptionHandler({
            NullPointerException.class, 
            HttpMessageNotWritableException.class,
            HBBCA_UserNotFoundException.class
    })
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String, Object> userNotFoundException(Exception ex){

        Map<String, Object> error = new HashMap<>();
        error.put("date", new Date());
        error.put("error", "el usuario o role no existe!");
        error.put("message", ex.getMessage());
        error.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());

        return error;

    }

}
