package com.gerardo.springboot.di.app.springboot_dei.services;

import java.util.List;

import com.gerardo.springboot.di.app.springboot_dei.models.Product;

public interface ProductService {

    public List<Product> findAll();
    public Product findById(Long id);
   
}
