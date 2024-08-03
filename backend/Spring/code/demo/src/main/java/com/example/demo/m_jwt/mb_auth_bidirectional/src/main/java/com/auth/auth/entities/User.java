package com.auth.auth.entities;

import java.util.ArrayList;
import java.util.List;

import com.andres.curso.springboot.app.springbootcrud.validation.ExistsByUsername;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    /**
     * Hace referencia a las validación personalizada ExistsByUsername
     * Valida si el usuario ya existe en la base de datos
     */
    @ExistsByUsername
    @Column(unique = true)
    @NotBlank
    @Size(min = 8, max = 16)
    private String username;

    @NotBlank
    private String password;

    /**
     * Cuando llamamos al usuario queremos ver sus roles y no al revés
     * No hay relación en cascada porque el rol se crea por separado del usuario
     * JsonIgnoreProperties de users es para que no haya resiliencia
     */
    @JsonIgnoreProperties({"users"})
    @ManyToMany
    @JoinTable(
            // Tabla con la que se relaciona
            name = "users_roles",
            // Clave foránea
            joinColumns = @JoinColumn(name = "user_id"),
            // Clave foránea con la que se relaciona
            inverseJoinColumns = @JoinColumn(name = "role_id"),
            // Asegura que no haya entradas duplicadas entre user_id y role_id
            uniqueConstraints = { @UniqueConstraint(columnNames = { "user_id", "role_id" }) })
    private List<Role> roles;

    // No es un campo en la tabla de usuarios
    @Transient
    private boolean admin;

    public User() {
        roles = new ArrayList<Role>();
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

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

    /**
     * Hace falta para la dependencia de relación muchos a muchos
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Id == null) ? 0 : Id.hashCode());
        result = prime * result + ((username == null) ? 0 : username.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (Id == null) {
            if (other.Id != null)
                return false;
        } else if (!Id.equals(other.Id))
            return false;
        if (username == null) {
            if (other.username != null)
                return false;
        } else if (!username.equals(other.username))
            return false;
        return true;
    }

}
