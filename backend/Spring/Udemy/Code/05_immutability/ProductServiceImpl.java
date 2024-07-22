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
     * Se podría también pasar por constructor sin @Autowired
     */
    @Autowired
    private Environment environment;

    /**
     * ProductRepositoryImpl es un componente y lo podemos inyectar con @Autowired.
     * Esto evita tener que instanciarlo en el constructor.
     * Se está intanciando a la interfaz ella nos inyectara la implementación.
     */
    @Autowired
    private ProductRepository repository;

    /**
     * Al constructor no es necesario indicar la anotación @Autowired
     * 
     * @param repository
     */
    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    /**
     * Inyección de dependencia mediante metódos.
     * Con Qualifier podemos indicar el nombre del componente a inyectar.
     * Spring ignoraría el primario y seleccionaría el especificado.
     * 
     * @param repository
     */
    @Autowired
    public void setProductRepository(@Qualifier("productList") ProductRepository repository) {
        this.repository = repository;
    }

    // RETORNAR UN CLON PARA NO MODIFICAR EL OBJETO EN MEMORIA
    // PORQUE SPRING POR DEFECTO MANEJA LAS INSTANCIAS COMO SINGLETON
    // CADA NEW AUNQUE SE LLAME IGUAL CREA UN NUEVA INSTANCIA EN MEMORIA
    public List<Product> findAll() {
        return repository
                .findAll()
                .stream()
                .map(p -> {
                    @SuppressWarnings("null")
                    Double priceTax = p.getPrice() * environment.getProperty("config.price.tax", Double.class);
                    // Product newProduct = new Product(p.getId(), p.getName(),
                    // priceTax.longValue());
                    // return newProduct;
                    Product newProduct = (Product) p.clone();
                    newProduct.setPrice(priceTax.longValue());
                    return newProduct;
                }).collect(Collectors.toList());
    }

    public Product findById(Long id) {
        return repository.findById(id);
    }

}
