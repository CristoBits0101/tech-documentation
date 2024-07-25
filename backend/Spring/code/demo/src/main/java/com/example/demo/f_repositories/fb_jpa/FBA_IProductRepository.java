package com.example.demo.f_repositories.fb_jpa;

import com.example.demo.c_entities.CA_User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FBA_IProductRepository extends JpaRepository<CA_User, Long> {

}
