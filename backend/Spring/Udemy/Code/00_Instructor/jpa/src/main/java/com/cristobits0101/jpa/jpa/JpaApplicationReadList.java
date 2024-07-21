package com.cristobits0101.jpa.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.cristobits0101.jpa.jpa.entities.Person;
import com.cristobits0101.jpa.jpa.repositories.PersonRepository1;

@SpringBootApplication
public class JpaApplicationReadList implements CommandLineRunner {

	@Autowired
	private PersonRepository1 personRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		list();
	}

	// TRAER VARIOS REGISTROS
	@Transactional(readOnly = true)
	public void list() {

		/**
		 * CONSULTAS PERSONALIZADAS
		 */
		List<Person> persons = (List<Person>) personRepository.findAll();
		persons.stream().forEach(System.out::println);

		List<Person> personsProgrammingLanguage = (List<Person>) personRepository.findByProgrammingLanguage("Java");
		personsProgrammingLanguage.stream().forEach(System.out::println);

		List<Person> personsName = (List<Person>) personRepository.findByName("Cristo1");
		personsName.stream().forEach(System.out::println);

		/**
		 * CONSULTAS NATIVAS
		 */
		List<Person> persons1 = (List<Person>) personRepository.buscarByProgrammingLanguage1("Java");
		persons1.stream().forEach(System.out::println);

		List<Person> persons2 = (List<Person>) personRepository.buscarByProgrammingLanguage2("Java", "Cristo2");
		persons2.stream().forEach(System.out::println);

		/**
		 * CONSULTAS SIN TRAER EL OBJETO
		 */
		List<Object[]> persons3 = (List<Object[]>) personRepository.obtenerValoresPersonasSinParametros();
		persons3.stream().forEach(person -> System.out.println(person[0] + " " + person[1]));

		List<Object[]> persons4 = (List<Object[]>) personRepository.obtenerValoresPersonasConParametros("Java",
				"Cristo2");
		persons4.stream().forEach(person -> System.out.println(person[0] + " " + person[1]));

	}

}