package com.ali.paymentservice.rest.controller;

import com.ali.paymentservice.entity.Product;
import com.ali.paymentservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping(value ="/")
    private String serviceCheck() {
        return "It works!";
    }

    @GetMapping("/{id}")
    private ResponseEntity<Optional<Product>> getProduct(@PathVariable Long id) {
        return productService.getProduct(id);
    }

}
