package com.arrimate.users.infrastructure.adapters.out.persistence.repositories;

import com.arrimate.users.infrastructure.adapters.out.persistence.entity.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<UserEntity, Long> {

}