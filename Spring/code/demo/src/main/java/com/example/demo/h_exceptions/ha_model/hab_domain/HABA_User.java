package com.example.demo.h_exceptions.ha_model.hab_domain;

public class HABA_User {

    private Long id;
    private String name;
    private String lastname;

    private HABB_Role role;

    public HABA_User() {
    }

    public HABA_User(Long id, String name, String lastname) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
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

    public HABB_Role getHABB_Role() {
        return role;
    }

    // public String getRoleName() {
    // return role.getName();
    // }

    public void setRole(HABB_Role role) {
        this.role = role;
    }

}
