package com.example.demo.g_ioc.gc_mutability.gcb_immutable.gcbb_stream_object;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/immutable-stream")
@RestController
public class GCBBB_Controller {

    // 6. Instance the Service
    @Autowired
    GCBBC_Service service;

    // 7. Return the service.findAll() method
    @GetMapping("/find-all")
    public List<GCBBA_Model> findAll() {
        return service.findAll();
    }

}
