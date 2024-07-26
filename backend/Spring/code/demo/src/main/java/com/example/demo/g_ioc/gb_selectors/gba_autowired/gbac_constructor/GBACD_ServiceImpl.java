package com.example.demo.g_ioc.gb_selectors.gba_autowired.gbac_constructor;

import org.springframework.stereotype.Service;

@Service
public class GBACD_ServiceImpl {

    GBACA_Interfaz gbbaInterface;

    // Inyecta la que tiene primary
    public GBACD_ServiceImpl(GBACA_Interfaz gbbaInterface) {
        
    }

}
