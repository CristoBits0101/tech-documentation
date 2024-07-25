package com.training.demo.controllers.redirect;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequestMapping("/redirect-to-page")
@Controller
public class RedirectController {

    @GetMapping("/redirect-to-page-hello")
    public String redirectPage() {
        return "redirect:hello";
    }

    @GetMapping("/hello-page")
    public String hello() {
        return "hello";
    }

}
