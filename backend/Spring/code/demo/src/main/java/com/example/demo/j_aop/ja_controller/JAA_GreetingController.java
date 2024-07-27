package com.example.demo.j_aop.ja_controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.j_aop.jb_service.JBA_GreetingService;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class JAA_GreetingController {

    @Autowired
    private JBA_GreetingService greetingService;

    @GetMapping("/greeting")
    public ResponseEntity<?> greeting() {
        return ResponseEntity
                .ok(Collections
                        .singletonMap("Greeting", greetingService.sayHello("Pepe", "Hola que tal!")));
    }

}
