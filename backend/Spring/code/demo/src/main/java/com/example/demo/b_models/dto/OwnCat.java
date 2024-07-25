package com.example.demo.b_models.dto;

import com.example.demo.b_models.Cat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class OwnCat {

    private String own;
    
    @Autowired
    private Cat cat;

}
