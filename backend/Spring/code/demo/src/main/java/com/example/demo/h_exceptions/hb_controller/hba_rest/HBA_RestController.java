package com.example.demo.h_exceptions.hb_controller.hba_rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HBA_RestController {
    
    // 1. java.lang.ArithmeticException: / by zero
    @GetMapping("/exception")
    public int index() {
        int value = 100 / 0;
        return value;
    }

}
