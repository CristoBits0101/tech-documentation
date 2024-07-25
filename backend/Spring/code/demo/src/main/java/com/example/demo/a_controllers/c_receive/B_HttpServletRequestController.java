package com.example.demo.a_controllers.c_receive;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RequestMapping("/params")
@RestController
public class B_HttpServletRequestController {

    @GetMapping("/parameters")
    public Double parameters(HttpServletRequest metadata) {
        Double price = Double.parseDouble(metadata.getParameter("price")); 
        return price;
    }

}
