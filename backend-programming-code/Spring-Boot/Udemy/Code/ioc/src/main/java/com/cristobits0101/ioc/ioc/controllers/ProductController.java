package com.cristobits0101.ioc.ioc.controllers;

import com.cristobits0101.ioc.ioc.models.Product;
import com.cristobits0101.ioc.ioc.services.ProductService;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class ProductController {

    /**
     * Spring va a buscar el componente que implemente el ProductService.
     * Luego lo inyecta en el ProductController.
     * Si varios componentes implementan la interfaz a que indicar cuál queremos.
     * El sentido es inyectar mediante la interfaz a los hijos.
     * Esto facilita la reutilización de código y mantenimiento.
     * No habría que tocar código solo indicar la implementación concreta.
     * Al Inyectar por nombre también hay que indicarlo junto a @Autowired.
     */
    @Autowired
    @Qualifier("productList")
    private ProductService productServiceImpl;

    @GetMapping("/product")
    public List<Product> list() {
        return productServiceImpl.findAll();
    }

    @GetMapping("/{id}")
    public Product show(@PathVariable Long id) {
        return productServiceImpl.findById(id);
    }

}
