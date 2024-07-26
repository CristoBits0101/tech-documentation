package com.example.demo.g_ioc.gc_mutability.gcb_immutable.gcbc_stream_clonable;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class GCBCD_Repository {

    // 1. Create a list of models
    List<GCBCA_Model> list;

    // 2. Inicialize the list of models in empty constructor
    public GCBCD_Repository() {
        this.list = Arrays.asList(
                new GCBCA_Model("Perro", 10.0),
                new GCBCA_Model("Gato", 5.0));
    }

    // 3. Return all models in the list
    public List<GCBCA_Model> findAll() {
        return list;
    }

}
