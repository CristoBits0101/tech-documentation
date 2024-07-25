package com.example.demo.d_controllers.db_mapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBA_WithoutRequestMapping {

    @GetMapping("/prefix")
    public String hello() {
        return "Sin prefijo.";
    }

}
