package com.cristobits0101.ioc.ioc.services;

import java.util.List;
import com.cristobits0101.ioc.ioc.models.Product;

public interface ProductService {
    public List<Product> findAll();

    public Product findById(Long id);
}
