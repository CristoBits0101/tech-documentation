package com.example.demo.g_ioc.gc_mutability.gca_mutable.gcab_stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/mutable-stream")
@Service
public class GCABC_Service {

    // 4. Instance the repository
    @Autowired
    GCABD_Repository repository;

    // 5. Return the repository.findAll() method
    public List<GCABA_Model> findAll() {
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
