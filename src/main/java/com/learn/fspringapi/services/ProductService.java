package com.learn.fspringapi.services;

import com.learn.fspringapi.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id);

    List<Product> getAllProducts();

    Product replaceProduct(Long id, Product product);

    Product updateProduct(Long id, Product product);

    Product createProduct(Product product);

    void deleteProduct();
}
