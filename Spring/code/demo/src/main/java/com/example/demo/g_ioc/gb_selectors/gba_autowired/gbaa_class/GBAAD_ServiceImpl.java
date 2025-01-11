package com.example.demo.g_ioc.gb_selectors.gba_autowired.gbaa_class;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GBAAD_ServiceImpl {

    @Autowired
    GBAAB_OneImpl gbbaInterface;
    
}
