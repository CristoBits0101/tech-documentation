package com.cristobits0101.ioc.ioc.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;
// import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import com.cristobits0101.ioc.ioc.models.Product;

/**
 * Entre comillas indicamos un nombre de componente alterno.
 * 
 * SessionScope hace que el componente deje de ser singleton.
 * Dura varias peticiones de un mismo usuario.
 * Cuando cierras la pestaña del navegador, el componente se destruye.
 * Todo lo que el usuario se mantiene modificado en la sesión.
 */
@SessionScope
@Repository("productList")
public class ProductRepositoryImpl implements ProductRepository {

    List<Product> data;

    public ProductRepositoryImpl() {
        this.data = Arrays.asList(
                new Product(1L, "Corsair", 300L),
                new Product(2L, "Intel", 150L),
                new Product(3L, "AMD", 75L));
    }

    public List<Product> findAll() {
        return data;
    }

    public Product findById(Long id) {
        return data
                .stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

}