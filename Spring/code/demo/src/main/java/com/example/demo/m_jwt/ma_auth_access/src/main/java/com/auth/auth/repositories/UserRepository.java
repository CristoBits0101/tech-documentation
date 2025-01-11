package com.auth.auth.repositories;

import org.springframework.data.repository.CrudRepository;

import com.auth.auth.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
