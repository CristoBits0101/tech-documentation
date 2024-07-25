package com.arrimate.users.domain.ports.in;

import com.arrimate.users.domain.models.UserModel;

import java.util.List;
import java.util.Optional;

public interface FindUserServicePort {
    Optional<UserModel> findUser(Long userId);
    List<UserModel> findAllUsers();
}
