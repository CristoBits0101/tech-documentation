package com.training.demo.controllers.types;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class ApiController {

    @GetMapping("/hello")
    public String hello() {
        return "Hola desde el controlador de la api.";
    }

}
