package com.siva.restlearning.SivasFolderMVC.NormalLearning.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import org.springframework.stereotype.Repository;

import com.siva.restlearning.SivasFolderMVC.NormalLearning.model.Product;

@Repository
public class ProductDAO {

    ArrayList<Product> products = new ArrayList<>();

    public ProductDAO() {
        
        for (int i = 1; i <= 10; i++) {

            ArrayList<String> tags = new ArrayList<>();

            tags.add("Tag " + i);
            tags.add("Popular");

            TreeMap<String, Double> dimensions = new TreeMap<>();

            dimensions.put("width", 10.5 + i);
            dimensions.put("height", 20.5 + i);
            dimensions.put("depth", 5.5 + i);

            Product product = new Product(
                    i,
                    "Product " + i,
                    "Description for product " + i,
                    "Category " + i,
                    i * 100.0,
                    5.0 + i,
                    4.0 + (i * 0.1),
                    50 + i,
                    tags,
                    "Brand " + i,
                    "SKU" + i,
                    1 + i,
                    dimensions,
                    "1 Year Warranty",
                    "Free Shipping",
                    "In Stock"
            );

            products.add(product);
        }
    }

    public List<Product> getProducts() {

        return products;
    }

    public Product addProduct(Product product){
        products.add(product);
        return product;
    }
}
