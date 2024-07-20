package com.cristobits0101.ioc.ioc.repositories;

import java.util.List;

import com.cristobits0101.ioc.ioc.models.Product;

public interface ProductRepository {

    public List<Product> findAll();

    public Product findById(Long id);

}
