package com.cristobits0101.relationships.relationships.repositories;

import org.springframework.data.repository.CrudRepository;

import com.cristobits0101.relationships.relationships.entities.ClientDetails;

public interface ClientDetailsRepository extends CrudRepository<ClientDetails, Long> {
    
}
