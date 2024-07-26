package com.example.demo.g_ioc.ga_immutability;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class GAA_Mutable {

    // Mutable Singleton Attributes
    private Long id;
    private String name;
    private int price;
    private List<GAA_Mutable> data;
    
    public GAA_Mutable() {
        this.data = Arrays.asList(
                new GAA_Mutable(1L, "Memoria corsair 32", 300),
                new GAA_Mutable(2L, "Cpu Intel Core i9", 850),
                new GAA_Mutable(3L, "Teclado Razer Mini 60%", 180),
                new GAA_Mutable(4L, "Motherboard Gigabyte", 490));
    }

    public GAA_Mutable(Long id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    GAA_Mutable gaaMutable = new GAA_Mutable();

    @GetMapping("/mutable")
    public List<GAA_Mutable> mutable() {
        gaaMutable
            .data
            .stream()
            .map(p -> p.getPrice() * 2)
            .collect(Collectors.toList());
        return gaaMutable.data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<GAA_Mutable> getData() {
        return data;
    }

    public void setData(List<GAA_Mutable> data) {
        this.data = data;
    }

}
