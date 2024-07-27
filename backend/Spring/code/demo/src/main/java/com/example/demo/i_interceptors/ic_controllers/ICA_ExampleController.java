package com.example.demo.i_interceptors.ic_controllers;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ICA_ExampleController {

    @GetMapping("example1")
    public Map<String, String> example1() {
        return Collections.singletonMap("message", "example1");
    }

    @GetMapping("example2")
    public Map<String, String> example2() {
        return Collections.singletonMap("message", "example1");
    }

    @GetMapping("example3")
    public Map<String, String> example3() {
        return Collections.singletonMap("message", "example1");
    }

}
