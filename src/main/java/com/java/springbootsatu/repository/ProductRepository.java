package com.java.springbootsatu.repository;

import com.java.springbootsatu.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
