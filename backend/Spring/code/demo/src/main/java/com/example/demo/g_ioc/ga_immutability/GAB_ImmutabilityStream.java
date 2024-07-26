package com.example.demo.g_ioc.ga_immutability;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class GAB_ImmutabilityStream {

    // Mutable Singleton Attributes
    private List<Integer> price = Arrays.asList(1, 2, 3);

    @GetMapping("/immutability-stream")
    public List<Integer> getPrice() {
        List<Integer> newPrice = price      // Guarda el retorno del map
            .stream()                       // Copia la lista con el tipo stream
            .map(p -> p * 2)                // Retorna el resultado
            .collect(Collectors.toList());  // Convierte el stream en lista
        return newPrice;
    }

}
