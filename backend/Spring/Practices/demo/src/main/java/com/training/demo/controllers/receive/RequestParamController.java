package com.training.demo.controllers.receive;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/params")
@RestController
public class RequestParamController {

    @GetMapping("/param")
    public String parameters(@RequestParam(required = false, defaultValue = "Cristo") String name) {
        return name;
    }

}
