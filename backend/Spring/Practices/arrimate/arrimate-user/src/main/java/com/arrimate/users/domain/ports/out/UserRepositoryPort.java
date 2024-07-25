package com.arrimate.users.domain.ports.out;

import com.arrimate.users.domain.models.UserModel;

import java.util.List;
import java.util.Optional;

public interface UserRepositoryPort {
    List<UserModel> findAll();
    Optional<UserModel> findById(Long id);
    UserModel save(UserModel user);
    Optional<UserModel> update(Long id, UserModel user);
    boolean deleteById(Long id);
}
