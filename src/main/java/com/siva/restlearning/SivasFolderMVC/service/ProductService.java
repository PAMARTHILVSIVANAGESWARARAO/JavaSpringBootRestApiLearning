package com.siva.restlearning.SivasFolderMVC.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siva.restlearning.SivasFolderMVC.dao.ProductDAO;
import com.siva.restlearning.SivasFolderMVC.model.Product;

@Service
public class ProductService {
    @Autowired
    ProductDAO productDAO;

    public List<Product> getProduct() {
        return productDAO.getProducts();
    }

    public Product addProduct(Product product){
        return productDAO.addProduct(product);
    }
}
