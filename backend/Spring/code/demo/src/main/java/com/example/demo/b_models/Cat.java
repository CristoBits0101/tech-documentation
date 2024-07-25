package com.example.demo.b_models;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Cat {

    private String name;
    private int age;
    private Map<String, String> attributes;

}
