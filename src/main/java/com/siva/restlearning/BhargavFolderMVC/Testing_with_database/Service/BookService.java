package com.siva.restlearning.BhargavFolderMVC.Testing_with_database.Service;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.siva.restlearning.BhargavFolderMVC.Testing_with_database.Entity.Book;
import com.siva.restlearning.BhargavFolderMVC.Testing_with_database.Repository.BookRepository;
import com.siva.restlearning.SivasFolderMVC.DBConnection.model.Mobile;

@Service
public class BookService {


    @Autowired
    private BookRepository repo;


    public List<Book> getAllBooks() {


        return repo.findAll();
    }
    public List<Book> getAllBooks1() {
        return repo.getAllBooks1();
    }
    public ResponseEntity<?> insertMany(List<Book> books) {

        int count = 0;
        for(int i = 0 ; i<books.size() ;i++){
            int res = repo.createBook(books.get(i).getName(), books.get(i).getAuthor(), books.get(i).getPrice());
            if(res > 0){
                count++;
            }
        }
        return new ResponseEntity<>("No of Rows inserted: " + count, HttpStatus.CREATED);
    }
}

