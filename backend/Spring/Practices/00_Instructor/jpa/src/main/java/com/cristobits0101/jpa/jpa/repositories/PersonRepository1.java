package com.cristobits0101.jpa.jpa.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;

// import org.springframework.data.jpa.repository.JpaRepository;
// public interface PersonRepository extends JpaRepository<Person, Long> {}

import org.springframework.data.repository.CrudRepository;
import com.cristobits0101.jpa.jpa.entities.Person;

/**
 * CrudRepository es una interfaz que extiende de JpaRepository.
 * Parametros: <Tipo de la entidad, Tipo de la clave primaria>
 */
public interface PersonRepository1 extends CrudRepository<Person, Long> {

    /**
     * CONSULTAS PERSONALIZADAS
     * findBy es palabra reservada parámetro es el nombre del método.
     * Busca por parámetro.
     */

    // Filtra por columna, por debajo es un where.
    List<Person> findByProgrammingLanguage(String programmingLanguage);

    // Filtra por columna, por debajo es un where.
    List<Person> findByName(String name);

    /**
     * CONSULTAS NATIVAS
     * Query pertenece a JPA y es para hacer consultas nativas.
     */

    // Trae todas las personas
    @Query("select p from Person p")
    List<Person> buscarByProgrammingLanguage1(String programmingLanguage);

    // Trae todas las personas con el lenguaje x y el nombre x.
    @Query("select p from Person p where p.programmingLanguage=1? and p.name=2?")
    List<Person> buscarByProgrammingLanguage2(String programmingLanguage, String name);

    /**
     * CONSULTAS SIN TRAER EL OBJETO
     * Lo normal es traer el objeto y obtener sus valores.
     * La última p es un alias
     */

    @Query("select p.name, p.programmingLanguage from Person p")
    List<Object[]> obtenerValoresPersonasSinParametros();

    @Query("select p.name, p.programmingLanguage from Person p")
    List<Object[]> obtenerValoresPersonasConParametros(String programmingLanguage, String name);

    /**
     * CONSULTAS ALMACENADAS ENVUELTAS EN OPTIONAL
     */
    // El 1 hace referencia al primer parámetro
    @Query("select p from Person p where p.id=?1")
    Optional<Person> findOne(Long id);

    @Query("select p from Person p where p.name=?1")
    Optional<Person> findOneName(String name);

    @Query("select p from Person p where p.name like %?1%")
    Optional<Person> findOneLikeName(String name);

    /**
     * CONSULTAS A DTO
     * Se pone el paquete por que no es una @entity
     */
    @Query("select new com.cristobits0101.jpa.jpa.dto.PersonDto(p.name, p.lastname) from Person p")
    List<Person> findAllPersonDto();

}
