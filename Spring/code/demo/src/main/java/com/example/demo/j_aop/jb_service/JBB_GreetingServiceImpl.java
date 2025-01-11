package com.example.demo.j_aop.jb_service;

import org.springframework.stereotype.Service;

@Service
public class JBB_GreetingServiceImpl implements JBA_GreetingService {

    @Override
    public String sayHello(String person, String phrase) {
        String greeting = phrase + " " + person;
        System.out.println(greeting);
        return greeting;
    }
    
}
