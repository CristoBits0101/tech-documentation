package com.example.demo.h_exceptions.hc_services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.h_exceptions.ha_model.hab_domain.HABA_User;

@Service
public class HCD_UserServiceImpl implements HCC_UserService {

    @Autowired
    private List<HABA_User> users;

    @Override
    public List<HABA_User> findAll() {
        return users;
    }

    @Override
    public Optional<HABA_User> findById(Long id) {
        return users.stream().filter(usr -> usr.getId().equals(id)).findFirst();
    }

}
