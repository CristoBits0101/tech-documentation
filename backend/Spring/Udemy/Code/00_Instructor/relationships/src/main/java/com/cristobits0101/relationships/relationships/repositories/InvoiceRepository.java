package com.cristobits0101.relationships.relationships.repositories;

import org.springframework.data.repository.CrudRepository;

import com.cristobits0101.relationships.relationships.entities.Invoice;

public interface InvoiceRepository extends CrudRepository<Invoice, Long>{
    
}
