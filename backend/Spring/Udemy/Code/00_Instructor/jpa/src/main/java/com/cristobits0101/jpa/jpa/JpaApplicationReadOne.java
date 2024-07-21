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
public class JpaApplicationReadOne implements CommandLineRunner {

	@Autowired
	private PersonRepository1 personRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	// Se ejecuta el método run() cuando la aplicación inicia.
	@Override
	public void run(String... args) throws Exception {
		findOne();
	}

	// TRAER UN REGISTRO
	@Transactional(readOnly = true)
	public void findOne() {

		// Opción 1
		Person personBasicQuery = personRepository.findById(1L).orElseThrow();
		System.out.println(personBasicQuery);

		// Opción 2
		Person person = null;
		Optional<Person> optionalPerson = personRepository.findById(1L);

		String personName = optionalPerson.get().getName();
		System.out.println(personName);

		// Opción 3
		if (optionalPerson.isPresent())
			person = optionalPerson.get();
		else
			System.out.println("No se encontro el registro");

		System.out.println(person);

		// Opción 4
		personRepository.findById(1L).ifPresent(System.out::println);

		// Opción 5
		Boolean result = personRepository.findById(1L).isEmpty();

		if (result)
			System.out.println("No se encontro el registro.");
	}

}