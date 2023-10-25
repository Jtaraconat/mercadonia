package com.johantaraconat.mercadoniabackend.controller;

import com.johantaraconat.mercadoniabackend.model.Category;
import com.johantaraconat.mercadoniabackend.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin("http://localhost:3000")
public class CategoryController {
    @Autowired
        private CategoryRepository categoryRepository;

    @PostMapping("/category")
        Category addCategory(@RequestBody Category newCategory){
        return categoryRepository.save(newCategory);
    }

    @GetMapping("/categories")
    List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }
}