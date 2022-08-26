package com.ali.paymentservice.service;

import com.ali.paymentservice.entity.Product;
import com.ali.paymentservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public ResponseEntity<Optional<Product>> getProduct(Long id) {
        return ResponseEntity.ok(productRepository.findById(id));
    }

}
