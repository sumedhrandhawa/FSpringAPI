package com.learn.fspringapi.controllers;

import com.learn.fspringapi.models.Product;
import com.learn.fspringapi.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    ProductController(ProductService productService){
        this.productService = productService;
    }
    //localhost:8080/products/1
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id){
        return productService.getProductById(id);
    }

    //localhost:8080/products
    @GetMapping()
    public List<Product> getAllProducts(){
        return new ArrayList<>();
    }
}
