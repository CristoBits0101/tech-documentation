package com.cristobits0101.exceptions.exceptions.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cristobits0101.exceptions.exceptions.models.domain.User;

@Service
public class UserServiceImpl implements UserService {

    private List<User> users;

    /**
     * Al realizar la petición genera un null pointer exception
     * El rol no está incializado.
     */
    public UserServiceImpl() {
        this.users = new ArrayList<>();
        users.add(new User(1L, "Cristo1", "Suárez1"));
        users.add(new User(1L, "Cristo2", "Suárez2"));
        users.add(new User(1L, "Cristo3", "Suárez3"));
        users.add(new User(1L, "Cristo4", "Suárez4"));
    }

    @Override
    public List<User> findAll() {
        return this.users;
    }

    @Override
    public Optional<User> findById(Long id) {
        User user = null;

        for (User u : users) {
            if (u.getId().equals(id)) {
                user = u;
                break;
            }
        }

        /**
         * Si user es nulo un optional vacío.
         * Si no retorna un optional con el objeto user.
         */
        return Optional.ofNullable(user);
    }

}
