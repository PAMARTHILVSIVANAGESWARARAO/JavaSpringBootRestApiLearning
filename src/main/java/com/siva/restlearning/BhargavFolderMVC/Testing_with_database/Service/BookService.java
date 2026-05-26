package com.siva.restlearning.BhargavFolderMVC.Testing_with_database.Service;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siva.restlearning.BhargavFolderMVC.Testing_with_database.Entity.Book;
import com.siva.restlearning.BhargavFolderMVC.Testing_with_database.Repository.BookRepository;

@Service
public class BookService {


    @Autowired
    private BookRepository repo;


    public List<Book> getAllBooks() {


        return repo.findAll();
    }
}

