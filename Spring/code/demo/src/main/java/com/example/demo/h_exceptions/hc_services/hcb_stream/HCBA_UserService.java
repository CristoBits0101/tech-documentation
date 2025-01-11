
package com.example.demo.h_exceptions.hc_services.hcb_stream;

import java.util.List;
import java.util.Optional;

import com.example.demo.h_exceptions.ha_model.hab_domain.HABA_User;

public interface HCBA_UserService {

    List<HABA_User> findAll();

    Optional<HABA_User> findById(Long id);

}
