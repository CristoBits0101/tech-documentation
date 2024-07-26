package com.example.demo.g_ioc.gc_mutability.gca_mutable.gcab_stream;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Repository
public class GCABD_Repository {

    // 1. Create a list of models
    List<GCABA_Model> list;

    // 2. Inicialize the list of models in empty constructor
    public GCABD_Repository() {
        this.list = Arrays.asList(
                new GCABA_Model("Perro", 10.0),
                new GCABA_Model("Gato", 5.0));
    }

    // 3. Return all models in the list
    public List<GCABA_Model> findAll() {
        return list;
    }

}
