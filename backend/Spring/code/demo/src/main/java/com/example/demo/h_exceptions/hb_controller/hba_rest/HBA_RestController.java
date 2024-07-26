package com.example.demo.h_exceptions.hb_controller.hba_rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.h_exceptions.ha_model.hab_domain.HABA_User;
import com.example.demo.h_exceptions.hc_services.HCA_UserService;

@RestController
public class HBA_RestController {

    @Autowired
    HCA_UserService userService;
    
    // 1. java.lang.ArithmeticException: / by zero
    @GetMapping("/division-exception")
    public int division() {
        int value = 100 / 0;
        return value;
    }

    // 2. 
    @GetMapping("/parse-exception")
    public int parse() {
        int value = Integer.parseInt("10x");
        return value;
    }

    // 3.
    @GetMapping("/show/{id}")
    public HABA_User findById(@PathVariable Long id) {
        return userService.findById(id);
    }

}
