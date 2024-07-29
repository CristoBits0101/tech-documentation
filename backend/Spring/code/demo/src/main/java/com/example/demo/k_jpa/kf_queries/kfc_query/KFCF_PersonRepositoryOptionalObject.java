package com.example.demo.k_jpa.kf_queries.kfc_query;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.k_jpa.kb_entities.KBA_PersonEntity;

public interface KFCF_PersonRepositoryOptionalObject extends CrudRepository<KBA_PersonEntity, Long> {

    @Query("select p from Person p where p.id=(select max(p.id) from Person p)")
    public Optional<KBA_PersonEntity> getLastRegistration();
    
    @Query("select p from Person p where p.id=?1")
    Optional<KBA_PersonEntity> findOne(Long id);
    
    @Query("select p from Person p where p.name=?1")
    Optional<KBA_PersonEntity> findOneName(String name);
    
    @Query("select p from Person p where p.name like %?1%")
    Optional<KBA_PersonEntity> findOneLikeName(String name);
    

}
