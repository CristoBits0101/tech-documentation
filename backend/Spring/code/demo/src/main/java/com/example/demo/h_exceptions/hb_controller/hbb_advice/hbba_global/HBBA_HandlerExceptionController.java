package com.example.demo.h_exceptions.hb_controller.hbb_advice.hbba_global;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.h_exceptions.ha_model.HAA_Error;

@ControllerAdvice
public class HBBA_HandlerExceptionController {

    // 
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<?> divisionByZeroA(Exception e) {

        // return ResponseEntity
        //     .status("500")
        //     .body("Error 500");

        // return ResponseEntity
        //         .internalServerError()
        //         .body("Error 500");

        HAA_Error error = new HAA_Error();

        error.setError("Error: Division by zero.");
        error.setMessage(e.getMessage());
        error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        error.setDate(new Date());

        return ResponseEntity
            .internalServerError()
            .body(error);

    }

}
