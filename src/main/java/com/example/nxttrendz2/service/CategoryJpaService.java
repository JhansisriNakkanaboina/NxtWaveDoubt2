package com.example.nxttrendz2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.ArrayList;
import com.example.nxttrendz2.model.Category;
import com.example.nxttrendz2.repository.CategoryJpaRepository;

@Service
public class CategoryJpaService {

    @Autowired
    private CategoryJpaRepository categoryJpaRepository;

    public ArrayList<Category> getAllCategories() {
        return new ArrayList<>(categoryJpaRepository.findAll());
    }

    public Category getCategory(int id) {
        try {
            return categoryJpaRepository.findById(id).get();
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public Category postCategory(Category category) {
        return categoryJpaRepository.save(category);
    }

    public Category putCategory(int id, Category category) {
        try {
            Category existingCategory = categoryJpaRepository.findById(id).get();
            if (category.getName() != null) {
                existingCategory.setName(category.getName());
            }
            if (category.getDescription() != null) {
                existingCategory.setDescription(category.getDescription());
            }
            return categoryJpaRepository.save(existingCategory);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public void deleteCategory(int id) {
        try {
            categoryJpaRepository.deleteById(id);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        throw new ResponseStatusException(HttpStatus.NO_CONTENT);
    }
}