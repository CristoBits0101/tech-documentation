package com.example.demo.g_ioc.ga_immutability;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class GAA_Mutable {

    // Singleton Attribute mutable
    private List<Integer> price = Arrays.asList(1, 2, 3);

    @GetMapping("mutable")
    public List<Integer> getPrice() {
        price
            .stream()                       // Convert to stream
            .map(p -> p *= 2)               // Return the result
            .collect(Collectors.toList());  // Convert to list
        return price;
    }

}
