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
public class KFBB_DemoApplication implements CommandLineRunner {

	// 2.0. INTERFAZ CON CONSULTAS PERSONALIZADAS
	@Autowired
	KFBA_PersonRepository repositoryPersonalized;

	/**
	 * MAIN
	 */
	public static void main(String[] args) {
		SpringApplication.run(KFBB_DemoApplication.class, args);
	}

	/**
	 * DESDE MAIN RUN ACCEDEMOS A REPOSITORY
	 */
	@Override
	public void run(String... args) throws Exception {

		// 2.1. findByProgrammingLanguage
		List<Person> query21 = (List<Person>) repository.findByProgrammingLanguage("Java");
		query21.stream().forEach(System.out::println);

		// 2.2. findByProgrammingLanguageAndName
		List<KBA_PersonEntity> query2 = (List<KBA_PersonEntity>) repositoryPersonalized.findByProgrammingLanguageAndName("Java", "Andres");
		query22.stream().forEach(System.out::println);
		
	}

}
