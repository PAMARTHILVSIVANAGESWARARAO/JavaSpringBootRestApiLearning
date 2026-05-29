package com.siva.restlearning.BhargavFolderMVC.Testing_with_database.Entity;




import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor

@NoArgsConstructor


@Entity
@Table(name = "booksiva")
public class Book {
    int c=0;
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // @Column(name = "book_name")
    private String name;

    // @Column(name = "book_author")
    private String author;

    // @Column(name = "book_price")
    private int price;

    
}