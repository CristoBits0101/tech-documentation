package com.example.demo.d_controllers.db_mapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/with")
@RestController
public class DBC_WithDoublePrefix {

    @GetMapping("/double/prefix")
    public String hello() {
        return "Con doble prefijo.";
    }

}
