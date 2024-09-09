package com.example.nxttrendz2.repository;

import java.util.List;
import com.example.nxttrendz2.model.Product;

public interface ProductRepository {
    List<Product> getAllProducts();

    Product getProductById(int id);

    Product postProduct(Product product);

    Product putProduct(int id, Product product);

    void deleteProduct(int id);
}