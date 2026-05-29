package com.siva.restlearning.SivasFolderMVC.DBConnection.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data   //instead of writing getters and setters we can use this annotation
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "mobile_information")
public class Mobile {

    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    private String brand;
    private String model;
    private double price;

    
}
