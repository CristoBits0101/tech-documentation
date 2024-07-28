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
public class DemoApplication implements CommandLineRunner {

	// 1.0. INTERFAZ CON CONSULTAS AUTOMATIZADAS
	@Autowired
	KFAA_PersonRepository repositoryAutomated;

	/**
	 * MAIN
	 */
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/**
	 * DESDE MAIN RUN ACCEDEMOS A REPOSITORY
	 */
	@Override
	public void run(String... args) throws Exception {

		// 1.1. findAll
		List<KBA_PersonEntity> query1 = (List<KBA_PersonEntity>) repositoryAutomated.findAll();
		query1.stream().forEach(System.out::println);

		// 1.2.1. findById
		Optional<KBA_PersonEntity> query2 = repositoryAutomated.findById();
		query2.ifPresent(System.out::println)

		// 1.2.2. findById
		@Transactional(readOnly=true)
		public void findById(KBA_PersonEntity) {
			repositoryAutomated.findById().ifPresent(System.out::println)
		}

		// 1.3. save
		@Transactional
		public void save() {
			KBA_PersonEntity person = new KBA_PersonEntity("Cristo", "Suárez", "Java",);
			repositoryAutomated.save(person);
		}

	}

}
