package com.cristobits0101.ioc.ioc.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.cristobits0101.ioc.ioc.models.Product;
import com.cristobits0101.ioc.ioc.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    /**
     * Inyección de dependencia mediante metódos.
     * Con Qualifier podemos indicar el nombre del componente a inyectar.
     * Spring ignoraría el primario y seleccionaría el especificado.
     * @Repository("productList")
     * @param repository
     */
    @Autowired
    public void setProductRepository(@Qualifier("productList") ProductRepository repository) {
        this.repository = repository;
    }

}
