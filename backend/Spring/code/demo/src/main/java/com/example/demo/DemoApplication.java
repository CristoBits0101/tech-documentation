package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.k_jpa.kb_entities.PersonEntity;
import com.example.demo.k_jpa.kc_repositories.PersonRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	PersonRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// Desde main accedemos a repository sin controlador ni service 
		List<PersonEntity> persons = (List<PersonEntity>) repository.findAll();
	
	}

}
