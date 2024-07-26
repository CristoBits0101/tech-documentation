package com.example.demo.g_ioc.gc_mutability.gcb_immutable.gcbb_stream;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Component
public class GCBBA_Model {

    private String name;
    private double price;

}
