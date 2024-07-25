package com.training.demo.controllers.types;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequestMapping("/mvc")
@Controller
public class MvcController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/bye")
    public String bye() {
        return "bye";
    }

    @GetMapping("/redirect-page")
    public String redirectPage() {
        return "redirect:hello";
    }

    
    @GetMapping("/forward-controller")
    public String forwardController() {
        return "forward:bye";
    }

}
