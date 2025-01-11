package com.example.demo.k_jpa.kf_queries.kfc_query;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.k_jpa.kb_entities.KBA_PersonEntity;

public interface KFCA_PersonRepositoryListPerson extends CrudRepository<KBA_PersonEntity, Long> {

    @Query("select p from Person p where p.id in ?1")
    public List<KBA_PersonEntity> getPersonsByIds(List<Long> ids);

    @Query("select p from Person p order by p.name, p.lastname desc")
    List<KBA_PersonEntity> getAllOrdered();

    @Query("select p from Person p where p.id between ?1 and ?2 order by p.name desc")
    List<KBA_PersonEntity> findAllBetweenId(Long id1, Long id2);

    @Query("select p from Person p where p.name between ?1 and ?2 order by p.name asc, p.lastname desc")
    List<KBA_PersonEntity> findAllBetweenName(String c1, String c2);

    @Query("select new Person(p.name, p.lastname) from Person p")
    List<KBA_PersonEntity> findAllObjectPersonPersonalized();

}
