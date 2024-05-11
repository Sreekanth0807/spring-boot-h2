package com.example.restdemo.controller;

import com.example.restdemo.domain.Product;
import com.example.restdemo.service.ProductService;
import com.example.restdemo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }




    @PostMapping("/save")
    public  ResponseEntity saveProduct(@RequestBody Product product) {
        Product savedProduct = productService.insertProductdata(product);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
