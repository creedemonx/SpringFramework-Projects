package com.gerardo.springboot.di.app.springboot_dei.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.gerardo.springboot.di.app.springboot_dei.models.Product;

@Component
public class ProductRepositoriesImpl implements ProductRepositories {
    private final List<Product> data;

    public ProductRepositoriesImpl() {
        this.data = Arrays.asList(
                new Product(1L, "Memoria Corsair 32Gb", 300L),
                new Product(2L, "Disco Duro 1Tb", 100L),
                new Product(3L, "Monitor 24", 150L),
                new Product(4L, "Teclado", 20L),
                new Product(5L, "Mouse", 10L));
    }

    @Override
    public List<Product> findAll() {
        return data;
    }

    @Override
    public Product findById(Long id) {
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

}
