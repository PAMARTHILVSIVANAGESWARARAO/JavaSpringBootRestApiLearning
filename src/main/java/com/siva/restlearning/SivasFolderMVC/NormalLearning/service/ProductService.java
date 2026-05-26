package com.siva.restlearning.SivasFolderMVC.NormalLearning.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siva.restlearning.SivasFolderMVC.NormalLearning.dao.ProductDAO;
import com.siva.restlearning.SivasFolderMVC.NormalLearning.model.Product;

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
