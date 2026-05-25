package com.siva.restlearning.BhargavFolderMVC.Testing_with_database.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siva.restlearning.BhargavFolderMVC.Testing_with_database.Entity.Book;
import com.siva.restlearning.BhargavFolderMVC.Testing_with_database.Service.BookService;

@RestController
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping("/books")
    public List<Book> showBooks() {

        return service.getAllBooks();
    }
}
