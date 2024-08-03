package com.auth.auth.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.auth.auth.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {
    // Para la validación
    boolean existsByUsername(String username);
    // Para traer al usuario
    Optional<User> findByUsername(String username);
}
