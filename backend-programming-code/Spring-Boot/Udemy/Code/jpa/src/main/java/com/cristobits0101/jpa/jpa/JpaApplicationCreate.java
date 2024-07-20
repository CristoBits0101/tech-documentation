package com.cristobits0101.jpa.jpa;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.cristobits0101.jpa.jpa.entities.Person;
import com.cristobits0101.jpa.jpa.repositories.PersonRepository1;

@SpringBootApplication
public class JpaApplicationCreate implements CommandLineRunner {

	@Autowired
	private PersonRepository1 personRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	// Se ejecuta el método run() cuando la aplicación inicia.
	@Override
	public void run(String... args) throws Exception {
		createUserDatabase();
	}

	/**
	 * Transactional es una buena práctica.
	 * Se usa cuando trabajamos con varias entidades.
	 * Permite hacer commit o rollback.
	 */
	@Transactional
	public void createUserDatabase() {
		Person person = new Person(null, "Juan", "Perez", "Java");
		Person personNew = personRepository.save(person);
		System.out.println(personNew);
	}

	@Transactional
	public void createUserScanner() {

		Scanner scanner = new Scanner(System.in);

		String name = scanner.next();
		String lastname = scanner.next();
		String language = scanner.next();

		scanner.close();

		Person person = new Person(null, name, lastname, language);
		Person personNew = personRepository.save(person);

		System.out.println(personNew);

		personRepository
				.findById(personNew.getId())
				.ifPresent(System.out::println);

	}

}