package com.example.demo.g_ioc.gl_files;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class GLA_ValueController {

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