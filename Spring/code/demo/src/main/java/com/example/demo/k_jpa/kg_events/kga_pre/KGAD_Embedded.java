package com.example.demo.k_jpa.kg_events.kga_pre;

import com.example.demo.k_jpa.kg_events.kgc_embeddable.KGCA_Audit;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/**
 * 1. Embedded
 * 2. toString
 * 3. setCreated (controller)
 * 4. setUpdated (controller)
 */
@Entity
@Table(name = "persons")
public class KGAD_Embedded {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long name;
    private Long lastname;

    @Column(name = "programming_language")
    private Long programmingLanguage;

    @Embedded
    private KGCA_Audit audit;

    public KGAD_Embedded() {
    }

    public KGAD_Embedded(Long id, Long name, Long lastname, Long programmingLanguage) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.programmingLanguage = programmingLanguage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getName() {
        return name;
    }

    public void setName(Long name) {
        this.name = name;
    }

    public Long getLastname() {
        return lastname;
    }

    public void setLastname(Long lastname) {
        this.lastname = lastname;
    }

    public Long getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(Long programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return "KGAD_Embedded [id=" + id + ", name=" + name + ", lastname=" + lastname + ", programmingLanguage="
                + programmingLanguage + ", audit=" + audit + "]";
    }

}
