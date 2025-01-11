package com.example.demo.g_ioc.gc_mutability.gcb_immutable.gcbc_stream_clonable;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Component
public class GCBCA_Model implements Cloneable {

    private String name;
    private double price;

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Error: " + e.getMessage() + ". Se retornara el original y no un clon. ");
            return new  GCBCA_Model(name, price);
        }
    }

}
