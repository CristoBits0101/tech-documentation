package com.example.demo.g_ioc.gc_mutability.gcb_immutable.gcbb_stream_object;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class GCBBD_Repository {

    // 1. Create a list of models
    List<GCBBA_Model> list;

    // 2. Inicialize the list of models in empty constructor
    public GCBBD_Repository() {
        this.list = Arrays.asList(
                new GCBBA_Model("Perro", 10.0),
                new GCBBA_Model("Gato", 5.0));
    }

    // 3. Return all models in the list
    public List<GCBBA_Model> findAll() {
        return list;
    }

}
