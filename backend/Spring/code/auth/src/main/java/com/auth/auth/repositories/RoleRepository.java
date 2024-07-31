package com.auth.auth.repositories;

import org.springframework.data.repository.CrudRepository;

import com.auth.auth.entities.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {

}
