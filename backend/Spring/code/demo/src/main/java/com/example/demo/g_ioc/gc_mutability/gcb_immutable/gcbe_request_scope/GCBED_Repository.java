package com.example.demo.g_ioc.gc_mutability.gcb_immutable.gcbe_request_scope;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.RequestScope;

import java.util.Arrays;
import java.util.List;

@RequestScope
@Repository
public class GCBED_Repository {

    // 1. Create a list of models
    List<GCBEA_Model> list;

    // 2. Inicialize the list of models in empty constructor
    public GCBED_Repository() {
        this.list = Arrays.asList(
                new GCBEA_Model("Perro", 10.0),
                new GCBEA_Model("Gato", 5.0));
    }

    // 3. Return all models in the list
    public List<GCBEA_Model> findAll() {
        return list;
    }

}
