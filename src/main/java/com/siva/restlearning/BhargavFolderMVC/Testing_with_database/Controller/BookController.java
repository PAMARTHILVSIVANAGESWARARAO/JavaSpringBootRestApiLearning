package com.siva.restlearning.BhargavFolderMVC.Testing_with_database.Controller;


import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siva.restlearning.BhargavFolderMVC.Testing_with_database.Entity.Book;
import com.siva.restlearning.BhargavFolderMVC.Testing_with_database.Service.BookService;

@RestController
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping("/books")
    public ResponseEntity<?> showBooks() {

        HashMap<String, List<Book>> map = new HashMap<>();
        
        map.put("books", service.getAllBooks());

        return new ResponseEntity<>(map , HttpStatus.OK);
    }
    @GetMapping("/books1")
    public ResponseEntity<?> showBooks1() { 
        
        HashMap<String, List<Book>> map = new HashMap<>();
        
        map.put("books", service.getAllBooks1());

        return new ResponseEntity<>(map , HttpStatus.OK);
    }
}
