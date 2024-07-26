package com.example.demo.g_ioc.gb_selectors.gba_autowired.gbab_interface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GBABD_ServiceImpl {

    @Autowired
    GBABA_Interfaz gbbaInterface;
    
}
