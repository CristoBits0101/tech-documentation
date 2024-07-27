package com.example.demo.a_config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import com.example.demo.h_exceptions.ha_model.hab_domain.HABA_User;

@Configuration
@PropertySources(@PropertySource(value = "classpath:values.properties", encoding = "UTF-8"))
public class AA_ValuesConfig {

    @Bean
    List<HABA_User> users() {
        List<HABA_User> users = new ArrayList<>();
        users.add(new HABA_User(1L, "Cristo1", "Suárez1"));
        users.add(new HABA_User(2L, "Cristo2", "Suárez2"));
        users.add(new HABA_User(3L, "Cristo3", "Suárez3"));
        users.add(new HABA_User(4L, "Cristo4", "Suárez4"));
        users.add(new HABA_User(5L, "Cristo5", "Suárez5"));
        return users;
    }
}
