package com.arrimate.users.application.service;

import com.arrimate.users.domain.models.UserModel;
import com.arrimate.users.domain.ports.in.DeleteUserServicePort;
import com.arrimate.users.domain.ports.in.FindUserServicePort;
import com.arrimate.users.domain.ports.in.SaveUserServicePort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserManagementService implements DeleteUserServicePort, FindUserServicePort, SaveUserServicePort {

    @Autowired
    private final DeleteUserServicePort deleteUserServicePort;

    @Autowired
    private final FindUserServicePort findUserServicePort;

    @Autowired
    private final SaveUserServicePort saveUserServicePort;

    public UserManagementService(
            DeleteUserServicePort deleteUserServicePort,
            FindUserServicePort findUserServicePort,
            SaveUserServicePort saveUserServicePort) {
        this.deleteUserServicePort = deleteUserServicePort;
        this.findUserServicePort = findUserServicePort;
        this.saveUserServicePort = saveUserServicePort;
    }

    @Override
    public boolean deleteUser(Long userId) {
        return deleteUserServicePort.deleteUser(userId);
    }

    @Override
    public List<UserModel> findAllUsers() {
        return findUserServicePort.findAllUsers();
    }

    @Override
    public Optional<UserModel> findUser(Long userId) {
        return findUserServicePort.findUser(userId);
    }

    @Override
    public UserModel saveUser(UserModel user) {
        return saveUserServicePort.saveUser(user);
    }

    @Override
    public Optional<UserModel> updateUser(Long userId, UserModel user) {
        return saveUserServicePort.updateUser(userId, user);
    }

}
