package com.example.demo.g_ioc.gc_mutability.gca_mutable.gcab_stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/mutable-stream")
@Service
public class GCABC_Service {

    @Autowired
    GCABD_Repository repository;

    public List<GCABA_Model> findAll() {
        repository.findAll().stream().map(p -> {
            double newPrice = p.getPrice() * 2;
            p.setPrice(newPrice);
            return p;
        });
        return repository.findAll();
    }

}
