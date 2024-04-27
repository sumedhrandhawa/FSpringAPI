package com.learn.fspringapi.controllers;

import com.learn.fspringapi.models.Product;
import com.learn.fspringapi.services.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class ProductControllerTest {
    @Autowired
    private ProductController productController;

    @MockBean // This is going to be Mocked Object.
    private ProductService productService;

    @Test
    void testValidGetProductById() {
        Product product = new Product();
        product.setId(1L);
        product.setTitle("Macbook pro");
        product.setPrice(150000.0);

        when(productService.getProductById(1L))
                .thenReturn(product);

        ResponseEntity<Product> responseEntity = productController.getProductById(1L);
        Product actualProduct = responseEntity.getBody();

        assertEquals(product, actualProduct);
    }

    //TODO
    @Test
    void testInvalidGetProductById() {
        // assertThrows(ProductNotFoundException.class, ()=> productController.getProductById(100L));
    }

    @Test
    void testGetAllProducts() {
        List<Product> expectedProducts = new ArrayList<>();
        Product p1 = new Product();
        p1.setId(1L);
        p1.setTitle("iPhone 13 Pro");
        Product p2 = new Product();
        p2.setId(2L);
        p2.setTitle("iPhone 14 Pro");
        Product p3 = new Product();
        p3.setId(3L);
        p3.setTitle("iPhone 15 Pro");

        expectedProducts.add(p1);
        expectedProducts.add(p2);
        expectedProducts.add(p3);

        when(productService.getAllProducts())
                .thenReturn(expectedProducts);

        List<Product> products = productController.getAllProducts();

        assertIterableEquals(expectedProducts,products);
    }
}