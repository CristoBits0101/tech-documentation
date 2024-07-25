package com.training.demo.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.training.demo.repositories.ProductRepository;

public class PrimaryProductoServiceImpl {

    @Autowired
    ProductRepository productRepository;

}
