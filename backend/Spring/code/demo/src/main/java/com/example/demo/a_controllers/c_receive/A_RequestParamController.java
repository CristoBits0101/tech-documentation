package com.example.demo.a_controllers.c_receive;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/params")
@RestController
public class A_RequestParamController {

    @GetMapping("/param")
    public String parameters(@RequestParam(required = false, defaultValue = "Cristo") String name) {
        return name;
    }

}
