package com.example.demo.a_controllers.b_mapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/with")
@RestController
public class B_WithRequestMapping {

    @GetMapping("/prefix")
    public String hello() {
        return "Con prefijo.";
    }

}
