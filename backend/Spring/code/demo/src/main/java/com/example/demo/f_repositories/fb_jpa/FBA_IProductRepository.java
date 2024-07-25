package com.example.demo.f_repositories.fb_jpa;

import com.example.demo.b_models.ba_class.BAB_ProductLombok;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FBA_IProductRepository extends JpaRepository<BAB_ProductLombok, Long> {

}
