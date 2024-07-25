package com.example.demo.g_ioc.ga_immutability;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;

public class GAB_ImmutabilityStream {

    // Singleton Attribute mutable
    private List<Integer> price = Arrays.asList(1, 2, 3);

    @GetMapping("mutable")
    public List<Integer> getPrice() {
        List<Integer> newPrice = price      // Guarda el retorno del map
            .stream()                       // Copia la lista con el tipo stream
            .map(p -> p *= 2)               // Retorna el resultado
            .collect(Collectors.toList());  // Convierte el stream en lista
        return newPrice;
    }

}
