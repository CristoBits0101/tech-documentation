package com.example.demo.d_controllers.da_types;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/mvc")
@Controller
public class DAA_MvcController {

    @GetMapping("/hello")
    public String hello() {
        // resources/templates/hello.html
        return "hello";
    }

}
