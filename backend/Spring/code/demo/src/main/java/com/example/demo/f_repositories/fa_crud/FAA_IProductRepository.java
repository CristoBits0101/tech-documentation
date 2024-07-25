package com.example.demo.f_repositories.fa_crud;

import com.example.demo.b_models.ba_class.BAB_ProductLombok;

import org.springframework.data.repository.CrudRepository;

public interface FAA_IProductRepository extends CrudRepository<BAB_ProductLombok, Long> {

}
