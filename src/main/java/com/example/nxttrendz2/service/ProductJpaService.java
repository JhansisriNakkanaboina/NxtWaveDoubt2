package com.example.nxttrendz2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.ArrayList;
import com.example.nxttrendz2.model.Product;
import com.example.nxttrendz2.repository.ProductJpaRepository;

@Service
public class ProductJpaService {

    @Autowired
    private ProductJpaRepository productJpaRepository;

    public ArrayList<Product> getAllProducts() {
        return new ArrayList<>(productJpaRepository.findAll());
    }

    public Product getProductById(int id) {
        try {
            return productJpaRepository.findById(id).get();
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public Product postProduct(Product product) {
        return productJpaRepository.save(product);
    }

    public Product putProduct(int id, Product product) {
        try {
            Product existingProduct = productJpaRepository.findById(id).get();
            if (product.getName() != null) {
                existingProduct.setName(product.getName());
            }
            if (product.getDescription() != null) {
                existingProduct.setDescription(product.getDescription());
            }
            if (product.getPrice() != 0) { // Avoid null check for primitive double
                existingProduct.setPrice(product.getPrice());
            }
            if (product.getCategory() != null) {
                existingProduct.setCategory(product.getCategory());
            }
            return productJpaRepository.save(existingProduct);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public void deleteProduct(int productId) {
        try {
            productJpaRepository.deleteById(productId);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        throw new ResponseStatusException(HttpStatus.NO_CONTENT);
    }
}
