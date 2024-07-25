package com.training.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.training.demo.models.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
