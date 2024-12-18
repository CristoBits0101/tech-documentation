package com.example.demo.g_ioc.gc_mutability.gcb_immutable.gcbb_stream_object;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GCBBC_Service {

    @Autowired
    GCBBD_Repository repository;

    public List<GCBBA_Model> findAll() {

        List<GCBBA_Model> newList = new ArrayList<>();

        repository.findAll().forEach(p -> {
            GCBBA_Model newModel = new GCBBA_Model();
            newModel.setName(p.getName());
            newModel.setPrice(p.getPrice() * 2);
            newList.add(newModel);
        });

        return newList;
    }
    
}
