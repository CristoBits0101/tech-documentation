package com.example.demo.g_ioc.gb_selectors.gbc_qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Primary
@Repository("twoImpl")
public class GBCC_TwoImpl implements GBCA_Interfaz {
    
}
