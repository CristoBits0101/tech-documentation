package com.example.demo.g_ioc.gc_mutability.gcb_immutable.gcbe_request_scope;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Component
public class GCBEA_Model {

    private String nombre;
    private double price;

}
