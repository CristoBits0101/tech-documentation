package com.training.demo.controllers.receive;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequestMapping("/path")
@RestController
public class PathVariableController {

    @GetMapping("/name/{name}")
    public String name(@PathVariable() String name) {
        return name;
    }

}
