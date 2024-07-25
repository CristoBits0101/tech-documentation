package com.example.demo.a_controllers.a_types;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class B_HybridController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hola desde el controlador híbrido.";
    }

}
