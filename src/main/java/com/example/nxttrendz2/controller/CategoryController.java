package com.example.nxttrendz2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import com.example.nxttrendz2.model.Category;
import com.example.nxttrendz2.service.CategoryJpaService;

@RestController
public class CategoryController {

    @Autowired
    private CategoryJpaService categoryJpaService;

    @GetMapping("/categories")
    public ArrayList<Category> getAllCategories() {
        return categoryJpaService.getAllCategories();
    }

    @GetMapping("/categories/{categoryId}")
    public Category getCategory(@PathVariable("categoryId") int id) {
        return categoryJpaService.getCategory(id);
    }

    @PostMapping("/categories")
    public Category postCategory(@RequestBody Category category) {
        return categoryJpaService.postCategory(category);
    }

    @PutMapping("/categories/{categoryId}")
    public Category putCategory(@PathVariable("categoryId") int id, @RequestBody Category category) {
        return categoryJpaService.putCategory(id, category);
    }

    @DeleteMapping("/categories/{categoryId}")
    public void deleteCategory(@PathVariable("categoryId") int id) {
        categoryJpaService.deleteCategory(id);
    }
}