package com.java.springbootsatu.service;

import java.util.List;

import com.java.springbootsatu.entity.Product;
import com.java.springbootsatu.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductService {
    
    @Autowired
    private ProductRepository repository;
    public List<Product> listAll(){
        return  repository.findAll();
    }

    public void save(Product product){
        repository.save(product);
    }

    public Product get(long id){
        return repository.findById(id).get();
    }

    public void delete(long id){
        repository.deleteById(id);
    }
}
