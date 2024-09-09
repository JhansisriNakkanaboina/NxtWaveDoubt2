package com.example.nxttrendz2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import com.example.nxttrendz2.model.Product;
import com.example.nxttrendz2.service.ProductJpaService;

@RestController
public class ProductController {

    @Autowired
    private ProductJpaService productJpaService;

    @GetMapping("/categories/products")
    public ArrayList<Product> getAllProducts() {
        return productJpaService.getAllProducts();
    }

    @GetMapping("/categories/products/{productId}")
    public Product getProductById(@PathVariable("productId") int id) {
        return productJpaService.getProductById(id);
    }

    @PostMapping("/categories/products")
    public Product postProduct(@RequestBody Product product) {
        return productJpaService.postProduct(product);
    }

    @PutMapping("/categories/products/{productId}")
    public Product putProduct(@PathVariable("productId") int id, @RequestBody Product product) {
        return productJpaService.putProduct(id, product);
    }

    @DeleteMapping("/categories/products/{productId}")
    public void deleteProduct(@PathVariable("productId") int id) {
        productJpaService.deleteProduct(id);
    }
}