package com.example.demo.g_ioc.gc_mutability.gcb_immutable.gcbc_stream_clonable;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/immutable-stream-clonable")
@RestController
public class GCBCB_Controller {

    // 6. Instance the Service
    @Autowired
    GCBCC_Service service;

    // 7. Return the service.findAll() method
    @GetMapping("/find-all")
    public List<GCBCA_Model> findAll() {
        return service.findAll();
    }

}
