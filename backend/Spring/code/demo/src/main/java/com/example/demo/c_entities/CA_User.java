package com.example.demo.c_entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "users")
@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class CA_User {
    
    @id
    private Long id;

    private String name;

}
