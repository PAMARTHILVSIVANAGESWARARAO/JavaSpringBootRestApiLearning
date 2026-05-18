package com.siva.restlearning.controller;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.ArrayList;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/products")
public class Product {

    ArrayList<HashMap<String , Object>> products = new ArrayList<>();

    public Product() {

        HashMap<String , Object> product1 = new HashMap<>();
        product1.put("id", 1);
        product1.put("name", "Product 1");
        product1.put("price", 10.0);
        products.add(product1);

        HashMap<String , Object> product2 = new HashMap<>();
        product2.put("id", 2);
        product2.put("name", "Product 2");
        product2.put("price", 20.0);
        products.add(product2);
    }

    @GetMapping
    public ResponseEntity<?> getProducts() {

        HashMap<String , Object> hm = new HashMap<>();

        hm.put("products", products);

        return new ResponseEntity<>(hm, HttpStatus.OK);
    }

    @PostMapping
    public HashMap<String, Object> addProduct(@RequestBody HashMap<String , Object> body) {
        products.add(body);
        HashMap<String , Object> response = new HashMap<>();
        response.put("message", "Product added successfully");
        response.put("product", body);
        return response;

    }
}