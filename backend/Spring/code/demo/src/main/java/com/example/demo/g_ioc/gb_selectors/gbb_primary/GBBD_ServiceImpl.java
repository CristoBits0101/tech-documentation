package com.example.demo.g_ioc.gb_selectors.gbb_primary;

import org.springframework.beans.factory.annotation.Autowired;

public class GBBD_ServiceImpl {

    // Inyecta la impl que tiene primary
    @Autowired
    GBBA_Interfaz gbbaInterface;
    
}
