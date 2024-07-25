package com.cristobits0101.aop.aop.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public String sayHello(String person, String phrase) {
        String greeting = phrase + "  " + person;
        System.out.println(greeting);
        return greeting;
    };

}
