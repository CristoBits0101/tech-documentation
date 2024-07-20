package com.cristobits0101.exceptions.exceptions.services;

import java.util.List;
import java.util.Optional;

import com.cristobits0101.exceptions.exceptions.models.domain.User;

public interface UserService {
    List<User> findAll();

    // Optional envuelve tanto si es nulo como no.
    Optional<User> findById(Long id);
}
