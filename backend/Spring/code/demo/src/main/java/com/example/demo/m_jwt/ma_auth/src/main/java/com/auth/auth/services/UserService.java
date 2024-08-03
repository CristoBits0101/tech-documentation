package com.auth.auth.services;

import java.util.List;

import com.auth.auth.entities.User;

public interface UserService {

    List<User> findAll();

    User save(User user);

}
