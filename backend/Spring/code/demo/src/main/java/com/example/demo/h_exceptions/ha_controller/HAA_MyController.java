package com.example.demo.h_exceptions.ha_controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HAA_MyController {
    
    // 
    @GetMapping("/exception")
    public int index() {
        int value = 100 / 0;
        return value;
    }

}
