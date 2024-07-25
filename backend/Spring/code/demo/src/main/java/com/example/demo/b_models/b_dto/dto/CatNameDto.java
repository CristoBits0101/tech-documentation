package com.example.demo.b_models.b_dto.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Component
@Data
@NoArgsConstructor
public class CatNameDto {
    
    private String name;

}
