package com.example.demo.g_ioc.gb_selectors.gbc_qualifier;

import org.springframework.beans.factory.annotation.Autowired;

public class GBCD_ServiceImpl {

    // Inyecta la impl que tiene primary
    @Autowired
    GBCA_Interfaz gbbaInterface;
    
}
