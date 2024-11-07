package com.gerardo.springboot.di.app.springboot_dei.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerardo.springboot.di.app.springboot_dei.models.Product;
import com.gerardo.springboot.di.app.springboot_dei.repositories.ProductRepositories;
import com.gerardo.springboot.di.app.springboot_dei.repositories.ProductRepositoriesImpl;

@Service
public class ProductServiceImpl implements ProductService {

    // Constructor con inyección de dependencias
    @Autowired
    private ProductRepositories repository;
    public ProductServiceImpl(ProductRepositories repository) {
        this.repository = repository;
    }

    public List<Product> findAll() {
        return repository.findAll().stream().map(p -> {
            Double tempPrice = p.getPrice() * 1.25d;
            Product modifiedProduct = new Product(p.getId(), p.getName(), tempPrice.longValue());
            return modifiedProduct;
        }).collect(Collectors.toList());
    }

    public Product findById(Long id) {
        return repository.findById(id);
    }
   


 
}
