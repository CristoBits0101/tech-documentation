package com.example.demo.g_ioc.gc_mutability.gcb_immutable.gcbc_stream_clonable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GCBCC_Service {

    @Autowired
    GCBCD_Repository repository;

    public List<GCBCA_Model> findAll() {
        repository
            .findAll()                                          // 1. Obtenemos la Lista Original
            .stream()                                           // 2. Trabaja sobre una vista que no modifica la original
            .map(p -> {                                         // 3. Transforma los elementos en el flujo.
                GCBCA_Model newModel = (GCBCA_Model) p.clone(); // 4. Clonamos el objeto original
                double newPrice = p.getPrice() * 2;             // 5. Copiamos el precio original incrementado
                newModel.setPrice(newPrice);                    // 6. Añadimos el nuevo precio al clon
                return newModel;                                // 7. Retornamos el clon modificado.
                })
            .collect(Collectors.toList());                      // 8. Parseamos el stream a lista.
    }
    
}
