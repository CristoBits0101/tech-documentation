package com.cristobits0101.ioc.ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * La siguiente anotación indica que la clase es una aplicación de Spring Boot.
 * Esta anotación es equivalente a la anotación @Configuration, @EnableAuto
 * Registrar los componentes en el contenedor de Spring como una instancia
 * singleton.
 * Luego permite inyectar los componentes en otras clases.
 * Con scope le da el alcance de la sesión.
 */
@SpringBootApplication
public class IocApplication {

	public static void main(String[] args) {
		SpringApplication.run(IocApplication.class, args);
	}

}
