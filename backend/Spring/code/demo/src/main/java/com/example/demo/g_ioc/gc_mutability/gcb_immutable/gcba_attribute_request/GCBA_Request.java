package com.example.demo.g_ioc.gc_mutability.gcb_immutable.gcba_attribute_request;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/immutable-attribute-request")
@RestController
public class GCBA_Request {

    @GetMapping("/price")
    public Integer getPrice() {
        /**
         * Immutable Singleton Variable
         * Se guarda en la memoria del servido
         * Pertenece a la petición y luego se destruye.
         */
        Integer price = 1;
        price *= 2;
        return price;
    }

}
