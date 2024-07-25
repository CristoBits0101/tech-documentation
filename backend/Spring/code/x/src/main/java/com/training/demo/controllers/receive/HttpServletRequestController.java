package com.training.demo.controllers.receive;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RequestMapping("/http")
@RestController("identifierName")
public class HttpServletRequestController {

    @GetMapping("/params")
    public Double parameters(HttpServletRequest metadata) {
        Double price = Double.parseDouble(metadata.getParameter("price")); 
        return price;
    }

}
