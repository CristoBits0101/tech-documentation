package com.example.demo.k_jpa.kf_queries.kfb_personalized;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.k_jpa.kb_entities.KBA_PersonEntity;

public interface KFBA_PersonRepository extends CrudRepository<KBA_PersonEntity, Long> {

    // findBy + column (word)
    List<KBA_PersonEntity> findByProgrammingLanguage(String programmingLanguage);

    // findBy + column + and + column (word + word)
    List<KBA_PersonEntity> findByProgrammingLanguageAndName(String programmingLanguage, String name);

}
