package com.auth.auth.repositories;

import org.springframework.data.repository.CrudRepository;

import com.auth.auth.entities.Role;
import java.util.Optional;

public interface RoleRepository extends CrudRepository<Role, Long> {

    Optional<Role> findByName(String roleName);

}
