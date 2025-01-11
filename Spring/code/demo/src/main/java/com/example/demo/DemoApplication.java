package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.k_jpa.kf_queries.kfa_automated.KFAA_PersonRepository;
import com.example.demo.k_jpa.kf_queries.kfb_personalized.KFBA_PersonRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	// 1. INTERFAZ CON CONSULTAS AUTOMATIZADAS
	@Autowired
	KFAA_PersonRepository repositoryAutomated;

	// 2. INTERFAZ CON CONSULTAS PERSONALIZADAS
	@Autowired
	KFBA_PersonRepository repositoryPersonalized;

	// 3. INTERFAZ CON CONSULTAS QUERY
	@Autowired
	KFBA_PersonRepository repositoryQuery;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/**
	 * DESDE MAIN ACCEDEMOS A REPOSITORY
	 */
	@Override
	public void run(String... args) throws Exception {

	}

}
