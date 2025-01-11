package com.example.demo.g_ioc.gc_mutability.gca_mutable.gcab_stream;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/mutable-stream")
@RestController
public class GCABB_Controller {

    // 6. Instance the Service
    @Autowired
    GCABC_Service service;

    // 7. Return the service.findAll() method
    @GetMapping("/find-all")
    public List<GCABA_Model> findAll() {
        return service.findAll();
    }

}
