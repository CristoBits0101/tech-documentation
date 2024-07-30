package com.example.demo.k_jpa.kh_associations.kha_many_to_one.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.k_jpa.kh_associations.kha_many_to_one.entities.Client;

public interface ClientRepository extends CrudRepository<Client, Long>{
    
}
