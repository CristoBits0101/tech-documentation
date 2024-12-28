package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.k_jpa.kb_entities.KBA_PersonEntity;
import com.example.demo.k_jpa.kf_queries.kfa_automated.KFAA_PersonRepository;
import com.example.demo.k_jpa.kf_queries.kfb_personalized.KFBA_PersonRepository;

@SpringBootApplication
public class KFCB_DemoApplication implements CommandLineRunner {

	// 3.0. INTERFAZ CON CONSULTAS QUERY
	@Autowired
	KFBA_PersonRepository repositoryQuery;

	/**
	 * MAIN
	 */
	public static void main(String[] args) {
		SpringApplication.run(KFCB_DemoApplication.class, args);
	}

	/**
	 * DESDE MAIN RUN ACCEDEMOS A REPOSITORY
	 */
	@Override
	public void run(String... args) throws Exception {

		// 3.1. INTERFAZ CON CONSULTAS QUERY
		persons.stream().forEach(person -> {
			System.out.println(person);
		});

		// 3.2. INTERFAZ CON CONSULTAS QUERY
		List<Object[]> personsValues = repository.obtenerPersonDataByProgrammingLanguage("Java");
		personsValues.stream().forEach(person -> {
			System.out.println(person[0] + " es experto en " + person[1]);
		});
	}

}
