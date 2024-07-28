package com.example.demo.k_jpa.kc_repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.k_jpa.kb_entities.PersonEntity;

public interface PersonRepository extends CrudRepository<PersonEntity, Long> {

}
