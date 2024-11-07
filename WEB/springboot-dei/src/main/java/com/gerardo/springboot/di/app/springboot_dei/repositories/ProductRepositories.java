package com.gerardo.springboot.di.app.springboot_dei.repositories;

import java.util.List;
import com.gerardo.springboot.di.app.springboot_dei.models.Product;

public interface ProductRepositories {

     List <Product> findAll();

    Product findById(Long id); 
}
