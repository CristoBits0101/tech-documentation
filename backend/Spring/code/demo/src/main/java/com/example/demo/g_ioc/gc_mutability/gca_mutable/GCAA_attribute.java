package com.example.demo.g_ioc.gc_mutability.gca_mutable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/mutable-attribute")
@RestController
public class GCAA_attribute {

    /**
     * Mutable Singleton attributes
     * Se guarda en la memoria del servido
     * Se comparte por todos los usuarios
     */
    public Integer price = 1;

    public void setPrice(Integer price) {
        this.price *= 2;
    }

    @GetMapping("/price")
    public Integer getPrice() {
        setPrice(2);
        return price;
    }

}
