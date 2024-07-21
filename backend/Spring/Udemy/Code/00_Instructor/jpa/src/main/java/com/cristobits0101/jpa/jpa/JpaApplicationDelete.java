package com.cristobits0101.jpa.jpa;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.cristobits0101.jpa.jpa.entities.Person;
import com.cristobits0101.jpa.jpa.repositories.PersonRepository1;

@SpringBootApplication
public class JpaApplicationDelete implements CommandLineRunner {

	@Autowired
	private PersonRepository1 personRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}

	@Transactional
	public void delete(Long id) {

		// Opcion 1
		personRepository.deleteById(id);

		// Opción 2
		Optional<Person> person = personRepository.findById(id);
		person.ifPresent(p -> personRepository.delete(p));

		// Opción 3
		person.ifPresentOrElse(
			p -> personRepository.delete(p),
			() -> System.out.println("No se encontró la persona.")
		);

		// Opción 4
		person.ifPresentOrElse(
			personRepository::delete,
			() -> System.out.println("No se encontró la persona.")
		);

	}

}