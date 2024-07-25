package com.example.demo.b_models.bb_dto.bba_add.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.b_models.bb_dto.bba_add.Cat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Component
@Data
@NoArgsConstructor
public class OwnCatDto {

    private String own;

    @Autowired
    private Cat cat;
    
}
