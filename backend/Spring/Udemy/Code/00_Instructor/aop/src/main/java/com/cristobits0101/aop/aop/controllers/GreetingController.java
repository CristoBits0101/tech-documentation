package com.cristobits0101.aop.aop.controllers;

import java.util.Collections;
import org.springframework.web.bind.annotation.RestController;

import com.cristobits0101.aop.aop.services.GreetingService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/hello")
    public ResponseEntity<?> getMethodName() {
        return ResponseEntity.ok(Collections.singletonMap("greeting", greetingService.sayHello("Cristo", "Hola :>")));
    }

}
