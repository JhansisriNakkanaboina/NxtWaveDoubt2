package com.example.nxttrendz2.repository;

import java.util.List;
import com.example.nxttrendz2.model.Category;

public interface CategoryRepository {
    List<Category> getAllCategories();

    Category getCategory(int id);

    Category postCategory(Category category);

    Category putCategory(int id, Category category);

    void deleteCategory(int id);
}