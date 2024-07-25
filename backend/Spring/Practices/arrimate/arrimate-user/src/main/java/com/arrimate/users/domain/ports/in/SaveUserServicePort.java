package com.arrimate.users.domain.ports.in;

import com.arrimate.users.domain.models.UserModel;

import java.util.Optional;

public interface SaveUserServicePort {
    UserModel saveUser(UserModel user);
    Optional<UserModel> updateUser(Long userId, UserModel user);
}
