package com.cristobits0101.exceptions.exceptions.controllers;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cristobits0101.exceptions.exceptions.exceptions.UserNotFoundException;
import com.cristobits0101.exceptions.exceptions.models.domain.User;
import com.cristobits0101.exceptions.exceptions.services.UserService;

// Estamos personalizando los errores que se devuelve por defecto con HandlerExeption
// Con UserNotFoundException y Throw creamos errores si sucede algo que no queremos.
@RequestMapping("/api")
@RestController
public class AppController {

    @Autowired
    private UserService userService;

    @GetMapping("/app")
    public String index() {
        // int value1 = 10 / 0;

        // parseo de string a entero, esto da un 200.
        int value2 = Integer.parseInt("10");

        // No se puede parsear no es un numero entero da error.
        int value3 = Integer.parseInt("10x");

        System.out.println(value2);
        System.out.println(value3);

        return "ok 200";
    }

    // @GetMapping("/show/{id}")
    // public ResponseEntity<?> show(@PathVariable("id") Long id) {

    /**
     * Opcion 1.
     */
    // User user = userService.findById(id);

    // // Si el objeto user es null (no existe), se lanza una excepcion.
    // if (user == null) {
    // throw new UserNotFoundException("¡El usuario no existe!");
    // }

    /**
     * Opcion 2.
     */
    // User user = userService.findById(id).orElseThrow(() -> new
    // UserNotFoundException("¡El usuario no existe!"));

    /**
     * Opcion 3.
     */
    // Optional<User> optionalUser = userService.findById(id);

    // if (optionalUser.isEmpty()) {
    // return ResponseEntity.notFound().build();
    // }

    // // Genera un null pointer exception porque el usuario no existe.
    // // System.out.println(user.getLastname());

    // return optionalUser.get();

    // }

}
