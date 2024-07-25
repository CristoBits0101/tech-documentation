package com.arrimate.users.application.usecases;

import com.arrimate.users.domain.ports.in.DeleteUserServicePort;
import com.arrimate.users.domain.ports.out.UserRepositoryPort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteUserUseCaseImpl implements DeleteUserServicePort {

    @Autowired
    private final UserRepositoryPort userRepositoryPort;

    public DeleteUserUseCaseImpl(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public boolean deleteUser(Long userId) {
        return userRepositoryPort.deleteById(userId);
    }

}
