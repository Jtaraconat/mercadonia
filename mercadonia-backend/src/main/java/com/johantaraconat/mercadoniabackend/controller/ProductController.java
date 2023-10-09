package com.johantaraconat.mercadoniabackend.controller;

import com.johantaraconat.mercadoniabackend.model.Product;
import com.johantaraconat.mercadoniabackend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/product")
    Product newProduct(@RequestBody Product newProduct){
        return productRepository.save(newProduct);
    }
    @GetMapping("/products")
    List<Product> getAllProducts(){
        return productRepository.findAll();
    }

}
