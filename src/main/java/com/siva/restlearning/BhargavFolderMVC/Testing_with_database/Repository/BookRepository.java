package com.siva.restlearning.BhargavFolderMVC.Testing_with_database.Repository;




import org.springframework.data.jpa.repository.JpaRepository;
import com.siva.restlearning.BhargavFolderMVC.Testing_with_database.Entity.Book;


public interface BookRepository extends JpaRepository<Book, Integer> {

  

}
