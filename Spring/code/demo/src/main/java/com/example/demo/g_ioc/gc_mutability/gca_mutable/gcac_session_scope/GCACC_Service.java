package com.example.demo.g_ioc.gc_mutability.gca_mutable.gcac_session_scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GCACC_Service {
    

    // 4. Instance the repository
    @Autowired
    GCACD_Repository repository;

    // 5. Return the repository.findAll() method
    public List<GCACA_Model> findAll() {
        /**
         * Datos Originales: Piensa en una lista como tu libro.
         * Stream: Es como tu lupa. Te permite ver y trabajar con los datos en la lista
         * de una manera diferente, pero no crea una copia de los datos.
         * Simplemente te da una forma de "mirar" esos datos y hacer cosas con ellos.
         */
        repository.findAll().stream().forEach(p -> {
            double newPrice = p.getPrice() * 2;
            p.setPrice(newPrice);
        });
        return repository.findAll();
    }

}
