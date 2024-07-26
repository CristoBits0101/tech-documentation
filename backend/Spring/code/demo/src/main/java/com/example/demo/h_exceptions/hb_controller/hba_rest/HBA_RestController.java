package com.example.demo.h_exceptions.hb_controller.hba_rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.h_exceptions.ha_model.hab_domain.HABA_User;
import com.example.demo.h_exceptions.hb_controller.hbb_advice.hbbc_exception.HBBCA_UserNotFoundException;
import com.example.demo.h_exceptions.hc_services.hca_conditionals.HCAA_UserService;
import com.example.demo.h_exceptions.hc_services.hcb_stream.HCBA_UserService;

import io.micrometer.core.ipc.http.HttpSender.Response;

import java.util.Optional;

@RestController
public class HBA_RestController {

    @Autowired
    HCAA_UserService userService;

    @Autowired
    HCBA_UserService userServiceOptional;

    // 1. java.lang.ArithmeticException: / by zero
    @GetMapping("/division-exception")
    public int division() {
        int value = 100 / 0;
        return value;
    }

    // 2. 
    @GetMapping("/parse-exception")
    public int parse() {
        int value = Integer.parseInt("10x");
        return value;
    }

    /**
     * 3.1
     * ¡Devuelve null si el id no existe en la lista!
     */
    @GetMapping("/show/{id}")
    public HABA_User findById1(@PathVariable Long id) {
        return userService.findById(id);
    }

    /**
     * 3.2
     * ¡Si el objeto es nulo no se puede llamar a sus propiedades!
     * ¡Si el objeto no tiene la propiedad inicializada es nulo!
     * Todo esto genera un null pointer exception.
     */
    @GetMapping("/show/{id}")
    public HABA_User findById2(@PathVariable Long id) {
        HABA_User user = userService.findById(id);
        System.out.println(user.getHABB_Role());
        return user;
    }

    /**
     * 3.3
     * Validamos el error en está función
     */
    @GetMapping("/show/{id}")
    public HABA_User findById3(@PathVariable Long id) {
        HABA_User user = userService.findById(id);
        if (user == null)
            throw new HBBCA_UserNotFoundException("Error el objeto es nulo o sus propiedades y metódos.");
        System.out.println(user.getHABB_Role());
        return user;
    }

    /**
     * 3.4.1
     * Validamos el error en está función
     */
    @GetMapping("/show/{id}")
    public HABA_User findById4(@PathVariable Long id) {
        HABA_User user = userServiceOptional.findById(id).orElseThrow(() -> new HBBCA_UserNotFoundException("Error el usuario no existe!"));
        System.out.println(user.getLastname());
        return user;
    }

    
    /**
     * 3.4.2
     * Manejando el optional directamente
     */
    @GetMapping("/show/{id}")
    public ResponseEntity<Object> findById5(@PathVariable Long id) {
        Optional<HABA_User> user = userServiceOptional.findById(id);
        if (user.isEmpty())
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(user.orElseThrow());
    }

}
