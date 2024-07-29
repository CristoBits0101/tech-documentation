package com.example.demo.k_jpa.kb_entities.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "persons")
public class KBB_PersonEntityDto {

    private String name;
    private String lastname;

    public KBB_PersonEntityDto(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "PersonDto [name=" + name + ", lastname=" + lastname + "]";
    }

}
