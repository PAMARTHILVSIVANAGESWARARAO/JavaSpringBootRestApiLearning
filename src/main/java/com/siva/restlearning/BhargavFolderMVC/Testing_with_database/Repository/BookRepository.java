package com.siva.restlearning.BhargavFolderMVC.Testing_with_database.Repository;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.siva.restlearning.BhargavFolderMVC.Testing_with_database.Entity.Book;


public interface BookRepository extends JpaRepository<Book, Integer> {
    @Query(value = "SELECT * FROM booksiva", nativeQuery = true)
    List<Book> getAllBooks1();

  

}
