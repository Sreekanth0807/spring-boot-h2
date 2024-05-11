package com.example.restdemo.service;

import com.example.restdemo.domain.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);
    List<Product> getAllProducts();
    Product insertProductdata(Product product);
    String deleteProductData(long id);
}
