package com.example.demo.h_exceptions.hc_services.hca_conditionals;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.demo.h_exceptions.ha_model.hab_domain.HABA_User;

@Service
public class HCAB_UserServiceImpl implements HCAA_UserService {

    private List<HABA_User> users;

    public HCAB_UserServiceImpl() {

        this.users = new ArrayList<HABA_User>();

        users.add(new HABA_User(1L, "Cristo1", "Suárez1"));
        users.add(new HABA_User(2L, "Cristo2", "Suárez2"));
        users.add(new HABA_User(3L, "Cristo3", "Suárez3"));
        users.add(new HABA_User(4L, "Cristo4", "Suárez4"));
        users.add(new HABA_User(5L, "Cristo5", "Suárez5"));

    }

    @Override
    public List<HABA_User> findAll() {
        return users;
    }

    @Override
    public HABA_User findById(Long id) {

        HABA_User user = null;

        for (HABA_User u : users)
            if (u.getId().equals(id)) {
                user = u;
                break;
            }

        return user;

    }

}
