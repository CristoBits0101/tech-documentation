package com.example.demo.c_entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "persons")
@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class CA_User {
    
    @id
    private Long id;
    private String name;
    private String lastname;
    private String programming_language;

}
