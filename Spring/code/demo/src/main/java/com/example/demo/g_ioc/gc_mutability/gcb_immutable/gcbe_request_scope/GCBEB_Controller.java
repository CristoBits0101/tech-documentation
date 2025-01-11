package com.example.demo.g_ioc.gc_mutability.gcb_immutable.gcbe_request_scope;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/immutable-request-scope")
@RestController
public class GCBEB_Controller {

    // 6. Instance the Service
    @Autowired
    GCBEC_Service service;

    // 7. Return the service.findAll() method
    @GetMapping("/find-all")
    public List<GCBEA_Model> findAll() {
        return service.findAll();
    }

}
