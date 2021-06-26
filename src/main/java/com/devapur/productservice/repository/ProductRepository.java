package com.devapur.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.devapur.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{

}
