package com.example.demo.b_models.b_dto.b_limit;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@AllArgsConstructor
@Component
@Data
@NoArgsConstructor
public class Dog {

    private String name;
    private int age;
    private Map<String, String> attributes;

}
