package com.example.demo.a_controllers.b_mapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/with")
@RestController
public class C_WithDoublePrefix {

    @GetMapping("/double/prefix")
    public String hello() {
        return "Con doble prefijo.";
    }

}
