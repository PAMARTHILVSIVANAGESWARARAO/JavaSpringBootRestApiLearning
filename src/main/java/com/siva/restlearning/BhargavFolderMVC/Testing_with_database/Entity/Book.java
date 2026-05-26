package com.siva.restlearning.BhargavFolderMVC.Testing_with_database.Entity;




import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String name;
    private String author;
    private int price;

    
}