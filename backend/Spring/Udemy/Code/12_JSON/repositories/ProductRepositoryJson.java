package com.cristobits0101.ioc.ioc.repositories;

import java.io.IOException;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.cristobits0101.ioc.ioc.models.Product;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
// Para trabajar con API Rest y con JSON...
import com.fasterxml.jackson.databind.ObjectMapper;

public class ProductRepositoryJson implements ProductRepository {

    private List<Object> list;

    // Spring provee de constructores vacíos por defecto.
    // public ProductRepositoryJson() {
    // }


    // Otra forma más.
    public ProductRepositoryJson() {
       Resource resource = new ClassPathResource("json/product.json");
       readValueJson(resource);
    }

    // Recibimos un {recurso de resource} como parámetro otra manera más.
    public ProductRepositoryJson(Resource resource) {
        readValueJson(resource);
    }

    // public ProductRepositoryJson() {
    //     // La interfaz resource esta haciendo polimorfismo en la implementeción.
    //     Resource resource = new ClassPathResource("json/product.json");

    //     // Permite convertir un archivo o un InputStream a un objeto Java.
    //     ObjectMapper objectMapper = new ObjectMapper();

    //     /**
    //      * Usa objectMapper para leer y deserializar el recurso.
    //      * Obtiene el archivo físico del recurso.
    //      * Deserializa el contenido del archivo a un array de Product.
    //      * Convierte el array de Product a una lista.
    //      */
    //     try {
    //         list = Arrays
    //                 .asList(objectMapper
    //                         .readValue(resource
    //                                 // .getFile(), Product[].class));
    //                                 .getInputStream(), Product[].class));
    //     } catch (StreamReadException e) {
    //         e.printStackTrace();
    //     } catch (DatabindException e) {
    //         e.printStackTrace();
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    // }

    private void readValueJson(Resource resource) {

        // Permite convertir un archivo o un InputStream a un objeto Java.
        ObjectMapper objectMapper = new ObjectMapper();

        /**
         * Usa objectMapper para leer y deserializar el recurso.
         * Obtiene el archivo físico del recurso.
         * Deserializa el contenido del archivo a un array de Product.
         * Convierte el array de Product a una lista.
         */
        try {
            list = Arrays
                    .asList(objectMapper
                            .readValue(resource
                                    // .getFile(), Product[].class));
                                    .getInputStream(), Product[].class));
        } catch (StreamReadException e) {
            e.printStackTrace();
        } catch (DatabindException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Product findById(Long id) {
        return (Product) list.stream()
                .filter(p -> ((Product) p).getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
    }

}
