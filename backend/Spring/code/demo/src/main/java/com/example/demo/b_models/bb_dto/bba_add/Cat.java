package com.example.demo.b_models.bb_dto.bba_add;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@AllArgsConstructor
@Component
@Data
@NoArgsConstructor
public class Cat {

    private String name;
    private int age;
    private Map<String, String> attributes;

}