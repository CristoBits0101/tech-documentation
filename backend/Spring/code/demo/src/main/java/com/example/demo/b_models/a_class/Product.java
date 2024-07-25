package com.example.demo.b_models.a_class;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Product {

    private Long id;
    private String name;
    private int price;

}
