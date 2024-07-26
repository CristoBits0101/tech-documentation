package com.example.demo.g_ioc.gd_read;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
public class GDA_ValueController {

    @Value("${config.developer}")
    private String developer;

    @Value("${config.age}")
    private String age;

    @Value("#{ '${config.colors}'.toUpperCase().split(',') }")
    private List<String> colors;

    @GetMapping("values")
    public List<String> valores(){
        List<String> personal = List.of(developer, age);
        return personal;
    }
    
}
