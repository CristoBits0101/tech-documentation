package com.example.demo.g_ioc.gc_mutability.gca_mutable.gcac_session_scope;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/mutable-session-scope")
@RestController
public class GCACB_Controller {

    // 6. Instance the Service
    @Autowired
    GCACC_Service service;

    // 7. Return the service.findAll() method
    @GetMapping("/find-all")
    public List<GCACA_Model> findAll() {
        return service.findAll();
    }

}
