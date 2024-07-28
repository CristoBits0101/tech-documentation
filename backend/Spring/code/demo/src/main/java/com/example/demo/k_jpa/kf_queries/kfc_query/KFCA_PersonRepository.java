package com.example.demo.k_jpa.kf_queries.kfc_query;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.k_jpa.kb_entities.KBA_PersonEntity;

public interface KFCA_PersonRepository extends CrudRepository<KBA_PersonEntity, Long> {

    /**
     * @Query   -> Define una consulta JPQL personalizada
     * select   -> Indica que queremos seleccionar datos
     * p        -> Para indicar que se traíga el objeto completo
     * Person p -> Entidad y su alias
     * Return   -> Devuelve todos los regístros porque no hay condiciones
     */

    @Query("select p from Person p")
    List<KBA_PersonEntity> buscarByProgrammingLanguageA(String programmingLanguage, String name);

    /**
     * p.                  -> Alias que hace referencia a la entidad Person
     * programmingLanguage -> Atributo de clase que equivale a columna de tabla
     * =?1                 -> Asigna el parámetro uno como valor de condición
     * =?2                 -> Asigna el parámetro dos como valor de condición
     */
    @Query("select p from Person p where p.programmingLanguage=?1 and p.name=?2")
    List<KBA_PersonEntity> buscarByProgrammingLanguageB(String programmingLanguage, String name);

    /**
     * p    -> Ahora almacena solo 2 atributos del objeto
     * List -> Se devuelve una lista de regístros con las columnas en cada posición
     */
    @Query("select p.name, p.programmingLanguage from Person p")
    List<Object[]> obtenerPersonData();

    @Query("select p.name, p.programmingLanguage from Person p where p.name=?1")
    List<Object[]> obtenerPersonData(String name);

    @Query("select p.name, p.programmingLanguage from Person p where p.programmingLanguage=?1 and p.name=?2")
    List<Object[]> obtenerPersonData(String programmingLanguage, String name);

    @Query("select p.name, p.programmingLanguage from Person p where p.programmingLanguage=?1")
    List<Object[]> obtenerPersonDataByProgrammingLanguage(String programmingLanguage);

}
