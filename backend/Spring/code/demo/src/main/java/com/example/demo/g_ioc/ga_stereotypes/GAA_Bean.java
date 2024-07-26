package com.example.demo.g_ioc.ga_stereotypes;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GAA_Bean {

    // 1. Declaration
    @Bean
    List<String> gaaBean() {
        List<String> names = Arrays.asList("Bean A", "Bean B");
        return names;
    }

    // 2. Inyection
    @SuppressWarnings("unused")
    @Autowired
    private List<String> gaaBean;

}
