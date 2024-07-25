package com.training.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cat {

    private String name;
    private int age;
    private Map<String, String> attributes;

}
