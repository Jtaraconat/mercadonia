package com.johantaraconat.mercadoniabackend.controller;

import com.johantaraconat.mercadoniabackend.exception.CategoryNotFoundException;
import com.johantaraconat.mercadoniabackend.model.Category;
import com.johantaraconat.mercadoniabackend.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = {"http://localhost:3000"})
public class CategoryController {
    @Autowired
        private CategoryRepository categoryRepository;

    @PostMapping("/category")
        Category newCategory(@RequestBody Category newCategory){
        return categoryRepository.save(newCategory);
    }

    @GetMapping("/categories")
    List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }
    @DeleteMapping("/category/{id}")
    String deleteCategory(@PathVariable Long id){
        if(!categoryRepository.existsById(id)) {
            throw new CategoryNotFoundException(id);
        }
        categoryRepository.deleteById(id);
        return "category avec l'id: " + id + " a été supprimé";
    }
}