package com.siva.restlearning.SivasFolderMVC.NormalLearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siva.restlearning.SivasFolderMVC.NormalLearning.model.Product;
import com.siva.restlearning.SivasFolderMVC.NormalLearning.service.ProductService;

@RestController
@RequestMapping("/siva")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("product")
    public ResponseEntity<?> getProducts() {
        return new ResponseEntity<>(productService.getProduct(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> addProduct(@RequestBody Product product) {
        return new ResponseEntity<>(productService.addProduct(product), HttpStatus.OK);
    }
}
