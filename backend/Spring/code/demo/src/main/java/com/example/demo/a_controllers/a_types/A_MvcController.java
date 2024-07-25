package com.example.demo.a_controllers.a_types;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/mvc")
@Controller
public class A_MvcController {

    @GetMapping("/hello")
    public String hello() {
        // resources/templates/hello.html
        return "hello";
    }

}
