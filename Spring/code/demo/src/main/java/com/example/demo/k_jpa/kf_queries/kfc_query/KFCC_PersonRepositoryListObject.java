package com.example.demo.k_jpa.kf_queries.kfc_query;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.k_jpa.kb_entities.KBA_PersonEntity;

public interface KFCC_PersonRepositoryListObject extends CrudRepository<KBA_PersonEntity, Long> {

    @Query("select p.name, length(p.name) from Person p where length(p.name)=(select min(length(p.name)) from Person p)")
    public List<Object[]> getShorterName();
    
    @Query("select p.name, length(p.name) from Person p")
    public List<Object[]> getPersonNameLength();
    
    @Query("select p.id, upper(p.name), lower(p.lastname), upper(p.programmingLanguage) from Person p")
    List<Object[]> findAllPersonDataListCase();
    
    @Query("select p, p.programmingLanguage from Person p")
    List<Object[]> findAllMixPerson();
    
    @Query("select p.id, p.name, p.lastname, p.programmingLanguage from Person p")
    List<Object[]> obtenerPersonDataList();
    
    @Query("select p.name, p.programmingLanguage from Person p")
    List<Object[]> obtenerPersonData();
    
    @Query("select p.name, p.programmingLanguage from Person p where p.name=?1")
    List<Object[]> obtenerPersonData(String name);
    
    @Query("select p.name, p.programmingLanguage from Person p where p.programmingLanguage=?1")
    List<Object[]> obtenerPersonDataByProgrammingLanguage(String programmingLanguage);

}
