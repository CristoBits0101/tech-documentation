package com.training.demo.controllers.types;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HybridController {
    
    @GetMapping("/cat")
    @ResponseBody
    public String hello() {
        return "Mi gato se llama toru.";
    }
    
}
