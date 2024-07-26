package com.example.demo.h_exceptions.hb_controller.hbb_advice.hbba_global;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HBBA_HandlerExceptionController {

    // 
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<?> divisionByZeroA() {
        return ResponseEntity
                .internalServerError()  // .status(500)
                .body("Error 500");
    }

}
