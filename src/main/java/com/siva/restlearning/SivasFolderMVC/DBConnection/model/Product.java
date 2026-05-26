package com.siva.restlearning.SivasFolderMVC.DBConnection.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class Product {
    
    // The Primary Key Declaration 

    Product() {
        System.out.println("\n\n Line 200: DB Connected And Product Model/Table Created\n\n");

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    Integer id;


    @Column(name = "product_name" , nullable = false)
    String name;

    @Column(name = "product_price" , nullable = false)
    Double price;
    
    @Column(name = "product_description" )
    String description;


}
