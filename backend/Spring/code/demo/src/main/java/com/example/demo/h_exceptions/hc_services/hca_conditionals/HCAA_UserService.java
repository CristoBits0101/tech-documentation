
package com.example.demo.h_exceptions.hc_services.hca_conditionals;

import java.util.List;

import com.example.demo.h_exceptions.ha_model.hab_domain.HABA_User;

public interface HCAA_UserService {

    List<HABA_User> findAll();

    HABA_User findById(Long id);

}
