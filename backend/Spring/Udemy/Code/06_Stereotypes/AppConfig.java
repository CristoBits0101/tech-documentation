package com.cristobits0101.ioc.ioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.cristobits0101.ioc.ioc.repositories.ProductRepository;
import com.cristobits0101.ioc.ioc.repositories.ProductRepositoryJson;

import jakarta.annotation.Resource;

/**
 * Sirve para configurar por ejemplo rest con jersey.
 * En este caso indicamos la ruta del fichero de propiedades.
 */
@Configuration
@PropertySource("classpath:config.properties")
public class AppConfig {

    // Otra foma de obtener el archivo sin Reource.
    @Value("classpath:json/product.json")
    private Resource resource;

    /**
     * Aquí se esta pasando por constructor
     * productJson es el nombre del componente y/o bean
     * Se podría inyectar
     * 
     * @return ProductRepositoryJson
     */
    @Bean("productJson")
    ProductRepository productRepositoryJson() {
        return new ProductRepositoryJson((org.springframework.core.io.Resource) resource);
    }

}
