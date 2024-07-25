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
public class JpaApplicationUpdate implements CommandLineRunner {

	@Autowired
	private PersonRepository1 personRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}

	@Transactional
	public void update(Long id) {

		// 1. Obtener persona
		Optional<Person> person = personRepository.findById(id);

		// 2. Verificar existencia
		person.ifPresent(p -> {

			// 3. Actualizar datos.
			p.setName("Adara");

			// 4. Guardar cambios.
			personRepository.save(p);

		});

	}

}