package com.cristobits0101.interceptor.interceptor.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/app")
public class AppController {

    @GetMapping("/foo1")
    public Map<String, String> foo1() {
        return Collections.singletonMap("message", "handler foo1 del controlador");
    }

    @GetMapping("/foo2")
    public Map<String, String> foo2() {
        return Collections.singletonMap("message", "handler foo2 del controlador");
    }

    @GetMapping("/foo3")
    public Map<String, String> foo3() {
        return Collections.singletonMap("message", "handler foo3 del controlador");
    }

}
