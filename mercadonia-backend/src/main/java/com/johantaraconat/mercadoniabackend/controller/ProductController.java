package com.johantaraconat.mercadoniabackend.controller;

import com.johantaraconat.mercadoniabackend.exception.ProductNotFoundException;
import com.johantaraconat.mercadoniabackend.model.Product;
import com.johantaraconat.mercadoniabackend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("http://localhost:3000")
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

    @GetMapping("/product/{id}")
    Product getProductById(@PathVariable long id){
        return productRepository.findById(id)
                .orElseThrow(()-> new ProductNotFoundException(id));
    }

    @PutMapping("/product/{id}")
    Product updateProduct(@RequestBody Product newProduct, @PathVariable Long id) {
        return productRepository.findById(id)
                .map(product -> {
                    product.setName(newProduct.getName());
                    product.setDescription(newProduct.getDescription());
                    product.setImage(newProduct.getImage());
                    product.setPrice(newProduct.getPrice());
                    product.setPromoPrice(newProduct.getPromoPrice());
                    product.setPromoStart(newProduct.getPromoStart());
                    product.setPromoEnd(newProduct.getPromoEnd());
                    return productRepository.save(product);
                })
                .orElseThrow(()->new ProductNotFoundException(id));
    }

    @DeleteMapping("/product/{id}")
    String deleteProduct(@PathVariable Long id){
        if(!productRepository.existsById(id)) {
            throw new ProductNotFoundException(id);
        }
        productRepository.deleteById(id);
        return "Produit avec l'id: " + id + " a été supprimé";
    }

}