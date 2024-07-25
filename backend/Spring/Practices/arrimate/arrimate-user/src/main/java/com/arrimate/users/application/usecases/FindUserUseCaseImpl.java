package com.arrimate.users.application.usecases;

import com.arrimate.users.domain.models.UserModel;
import com.arrimate.users.domain.ports.in.FindUserServicePort;
import com.arrimate.users.domain.ports.out.UserRepositoryPort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FindUserUseCaseImpl implements FindUserServicePort {

    @Autowired
    private final UserRepositoryPort userRepositoryPort;

    public FindUserUseCaseImpl(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public List<UserModel> findAllUsers() {
        return userRepositoryPort.findAll();
    }

    @Override
    public Optional<UserModel> findUser(Long userId) {
        return userRepositoryPort.findById(userId);
    }

}
