package com.cristobits0101.ioc.ioc.repositories;

// import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.cristobits0101.ioc.ioc.models.Product;

/**
 * Con primary establece el componente prioritario a inyectar.
 * Cuando la interface llame a una implementación lo selecciona.
 */
@Primary
@Repository
public class ProductRepositoryFoo implements ProductRepository {

    // @Override
    // public List<Product> findAll() {
    // return Collections.singletonList(new Product(1L, "Product 1", 100L));
    // }

    @Override
    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1L, "Product 1", 100L));
        return products;
    }

    @Override
    public Product findById(Long id) {
        return new Product(id, "Money", 100L);
    }

}
