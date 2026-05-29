package com.siva.restlearning.BhargavFolderMVC.Testing_with_database.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Modifying;

import jakarta.transaction.Transactional;

import com.siva.restlearning.BhargavFolderMVC.Testing_with_database.Entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

    @Query(value = "SELECT * FROM booksiva", nativeQuery = true)
    List<Book> getAllBooks1();

    @Modifying
    @Transactional
    @Query(
        value = "INSERT INTO booksiva(name, author, price) VALUES(?1, ?2, ?3)",
        nativeQuery = true
    )
    int createBook(String name, String author, int price);
}