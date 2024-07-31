package com.auth.auth.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String username;
    private String password;

    // When calling the user we want to see their roles and not the other way around
    @ManyToMany
    @JoinTable(
            // Table to which it relates
            name = "users_roles",
            // Foreign key
            joinColumns = @JoinColumn(name = "user_id"),
            // Foreign key with which it is related
            inverseJoinColumns = @JoinColumn(name = "role_id"),
            // Ensures that there are no duplicate entries between user_id and role_id
            uniqueConstraints = { @UniqueConstraint(columnNames = { "user_id", "role_id" }) })
    private List<Role> roles;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

}
