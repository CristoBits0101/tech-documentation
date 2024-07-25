package com.example.demo.b_models.a_class;

import org.springframework.stereotype.Component;

@Component
public class A_Product {

    // Atributes
    private Long id;
    private String name;
    private int price;

    // Constructors
    public A_Product() {
    }

    public A_Product(Long id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Setters and getters
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

    // toString method
    @Override
    public String toString() {
        return "A_Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }

}
