package com.example.demo.g_ioc.gc_mutability.gca_mutable.gcbc_session_scope;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Component
public class GCBCA_Model {

    private String nombre;
    private double price;

}
