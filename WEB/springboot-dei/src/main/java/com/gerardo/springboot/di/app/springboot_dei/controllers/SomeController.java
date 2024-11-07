package com.gerardo.springboot.di.app.springboot_dei.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.gerardo.springboot.di.app.springboot_dei.models.Product;
import com.gerardo.springboot.di.app.springboot_dei.services.ProductService;
import com.gerardo.springboot.di.app.springboot_dei.services.ProductServiceImpl;

@RestController
@RequestMapping("/api")
public class SomeController {
    @Autowired
    private final ProductService service;

    // Constructor con inyección de dependencias
 
    public SomeController(ProductServiceImpl service) {
        this.service = service;
    }

    @GetMapping()
    public List<Product> list() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Product show(@PathVariable Long id) {
        return service.findById(id);
    }
}
