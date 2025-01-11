package com.example.demo.k_jpa.kf_queries.kfc_query;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.k_jpa.kb_entities.KBA_PersonEntity;
import com.example.demo.k_jpa.kb_entities.dto.KBB_PersonEntityDto;

public interface KFCB_PersonRepositoryListPersonDto extends CrudRepository<KBA_PersonEntity, Long> {

    @Query("select new com.andres.curso.springboot.jpa.springbootjpa.dto.PersonDto(p.name, p.lastname) from Person p")
    List<KBB_PersonEntityDto> findAllPersonDto();

}
