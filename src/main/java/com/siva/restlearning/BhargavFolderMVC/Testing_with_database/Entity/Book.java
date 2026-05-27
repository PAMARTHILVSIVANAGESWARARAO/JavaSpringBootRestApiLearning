package com.siva.restlearning.BhargavFolderMVC.Testing_with_database.Entity;




import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "booksiva")
public class Book {
    int c=0;
    Book()
    {
        c++;
        System.out.println("Book Object Created " + c);
    }

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