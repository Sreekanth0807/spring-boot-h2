package com.example.restdemo.service;

import com.example.restdemo.domain.Product;
import com.example.restdemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Product insertProductdata(Product product) {
        return productRepository.save(product);
    }


    @Override
    public String deleteProductData(long id) {
        productRepository.deleteById(id);
        return "Deleted Successfully";
    }
}
