package com.arrimate.users.application.usecases;

import com.arrimate.users.domain.models.UserModel;
import com.arrimate.users.domain.ports.in.SaveUserServicePort;
import com.arrimate.users.domain.ports.out.UserRepositoryPort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SaveUserUseCaseImpl implements SaveUserServicePort {

    @Autowired
    private final UserRepositoryPort userRepositoryPort;

    public SaveUserUseCaseImpl(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public UserModel saveUser(UserModel user) {
        return userRepositoryPort.save(user);
    }

    @Override
    public Optional<UserModel> updateUser(Long userId, UserModel user) {
        return userRepositoryPort.update(userId, user);
    }

}
