package com.andres.springboot.di.app.springbootdi.repositories;

import java.util.List;

import com.andres.springboot.di.app.springbootdi.models.Product;

public interface ProductoRepository {
    List<Product> findAll();

    Product findById(Long id);
}
