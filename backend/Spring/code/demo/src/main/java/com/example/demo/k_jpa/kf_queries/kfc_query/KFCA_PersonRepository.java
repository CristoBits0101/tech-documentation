package com.example.demo.k_jpa.kf_queries.kfc_query;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.k_jpa.kb_entities.KBA_PersonEntity;

public interface KFCA_PersonRepository extends CrudRepository<KBA_PersonEntity, Long> {

    @Query("select p from Person p where p.programmingLanguage=?1 and p.name=?2")
    List<KBA_PersonEntity> buscarByProgrammingLanguage(String programmingLanguage, String name);

    @Query("select p.name, p.programmingLanguage from Person p")
    List<Object[]> obtenerPersonData();

    @Query("select p.name, p.programmingLanguage from Person p where p.name=?1")
    List<Object[]> obtenerPersonData(String name);

    @Query("select p.name, p.programmingLanguage from Person p where p.programmingLanguage=?1 and p.name=?2")
    List<Object[]> obtenerPersonData(String programmingLanguage, String name);

    @Query("select p.name, p.programmingLanguage from Person p where p.programmingLanguage=?1")
    List<Object[]> obtenerPersonDataByProgrammingLanguage(String programmingLanguage);

}
