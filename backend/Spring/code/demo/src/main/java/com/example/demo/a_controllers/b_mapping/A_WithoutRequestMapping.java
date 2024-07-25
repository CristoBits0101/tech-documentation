package com.example.demo.a_controllers.b_mapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class A_WithoutRequestMapping {

    @GetMapping("/prefix")
    public String hello() {
        return "Sin prefijo.";
    }

}
