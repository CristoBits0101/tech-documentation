package com.cristobits0101.jpa.jpa.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

/**
 * Table mapea la clase a la tabla de la base de datos.
 */
@Entity
@Table(name = "persons")
public class Person {

    /**
     * Id es para mapear la variable identificadora.
     * IDENTITY automáticamente genera un id para cada instancia.
     * Column es para mapear la variable a la columna de la tabla.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastname;

    @Column(name = "programming_language")
    private String programmingLanguage;

    @Embedded
    private Audit audit;

    public Person() {
    }

    /**
     * Si tienes un constructor con parametros hay que tener uno vacío.
     * JPA usa el constructor vacío para crear una instancia.
     * Por defecto hay un constructor vacío para crear una instancia.
     */
    public Person(Long id, String name, String lastname, String programmingLanguage) {
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

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", createAt='" + audit.getCreateAt() + '\'' +
                ", updatedAt='" + audit.getUpdatedAt() + '\'' +
                '}';
    }

}
