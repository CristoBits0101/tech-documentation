package com.example.demo.g_ioc.ga_immutability;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class GAA_Mutable {

    private List<Integer> price = Arrays.asList(1, 2, 3);

    @GetMapping("path")
    public List<Integer> getPrice() {
        price.stream().map(p -> p *= 2);
        return price;
    }

}
