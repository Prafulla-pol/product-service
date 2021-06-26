package com.devapur.productservice.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.devapur.productservice.model.Store;

@Repository
public interface StoreRepository extends MongoRepository<Store, String> {

    Optional<Store> findByEmail(String email);

    Page<Store> findAllBy(TextCriteria criteria, Pageable pageable);
}