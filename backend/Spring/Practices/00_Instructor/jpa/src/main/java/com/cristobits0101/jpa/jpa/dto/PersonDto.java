package com.cristobits0101.jpa.jpa.dto;

public class PersonDto {

    private String name;
    private String lastname;

    /**
     * En las entidades tendrías que declarar un constructor vacío.
     * Cuando tienes un constructor personalizado.
     * En los DTO no.
     */
    public PersonDto(String name, String lastname) {
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

}
