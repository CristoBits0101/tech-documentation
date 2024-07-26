package com.example.demo.g_ioc.gb_selectors.gba_autowired.gbad_setters;

import org.springframework.stereotype.Service;

@Service
public class GBADD_ServiceImpl {

    GBADA_Interfaz gbbaInterface;

    public void setGBADA_Interfacez(GBADA_Interfaz gbbaInterface) {
        this.gbbaInterface = gbbaInterface;
    }

}
