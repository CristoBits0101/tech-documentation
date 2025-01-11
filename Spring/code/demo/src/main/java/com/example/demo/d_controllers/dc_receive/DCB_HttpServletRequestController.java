package com.example.demo.d_controllers.dc_receive;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RequestMapping("/params")
@RestController
public class DCB_HttpServletRequestController {

    @GetMapping("/parameters")
    public Double parameters(HttpServletRequest metadata) {
        Double price = Double.parseDouble(metadata.getParameter("price")); 
        return price;
    }

}
