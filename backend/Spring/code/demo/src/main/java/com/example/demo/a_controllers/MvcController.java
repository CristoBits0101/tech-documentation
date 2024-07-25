package com.training.demo.a_controllers.types;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/mvc")
@Controller
public class MvcController {

    @GetMapping("/hello")
    public String hello() {
        return "Hola desde el controlador mvc.";
    }

}
