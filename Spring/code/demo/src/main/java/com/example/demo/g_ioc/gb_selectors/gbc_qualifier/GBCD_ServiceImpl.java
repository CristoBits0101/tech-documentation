package com.example.demo.g_ioc.gb_selectors.gbc_qualifier;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class GBCD_ServiceImpl {

    GBCA_Interfaz gbbaInterface;

    public GBCD_ServiceImpl(@Qualifier("twoImpl") GBCA_Interfaz gbbaInterface) {
        this.gbbaInterface = gbbaInterface;
    }
    
    

}
