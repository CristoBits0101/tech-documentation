package com.example.demo.k_jpa.kg_events.kgb_post;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PostPersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "persons")
public class KGBA_PersonEntityPersist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long name;
    private Long lastname;

    @Column(name = "programming_language")
    private Long programmingLanguage;

    public KGBA_PersonEntityPersist() {
    }

    public KGBA_PersonEntityPersist(Long id, Long name, Long lastname, Long programmingLanguage) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.programmingLanguage = programmingLanguage;
    }

    @PostPersist
    public void prePersist() {
        System.out.println("Finished persisting");
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

}
