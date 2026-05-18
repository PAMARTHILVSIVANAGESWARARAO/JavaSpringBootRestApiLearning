package com.siva.restlearning.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

@RestController
@RequestMapping("/library")
public class Library {
    // Here Linked HashMap is used to send data as in this order only , if hashmap
    // is used the data will be in any order

    Map<String, String> hm = new LinkedHashMap<>();
    HashMap<String, String> hm1 = new HashMap<>();
    HashMap<String, String> hm2 = new HashMap<>();
    ArrayList<HashMap<String, String>> arr = new ArrayList<>();

    Library() {
        hm.put("name", "Core java");
        hm.put("author", "Hoorstmann");
        hm.put("Copies", "5");

        hm1.put("name", "C primer plus");
        hm1.put("author", "stephen");
        hm1.put("copies", "10");

        hm2.put("name", "python");
        hm2.put("author", "Eric");
        hm2.put("copies", "7");
        arr.add(hm1);
        arr.add(hm2);

    }

    @GetMapping("/book")
    public Map<String, String> overallBooks() {

        return hm;
    }

    @GetMapping("/books")
    public ArrayList<HashMap<String, String>> NoOfBooks() {

        return arr;
    }

    // postMAppinng started
    @PostMapping("/book")
    public ResponseEntity<String> addBook(
            @RequestBody HashMap<String, String> body) {
    //ResponseEntity is used to send the response codes              
    //Here @RequestBody HashMap<String, String> body is used to get the data from the request body and store it in a HashMap called body. 
        String name = body.get("name");
        String author = body.get("author");
        String copies = body.get("copies");
        HashMap<String, String> newBook = new HashMap<>();
        newBook.put("name", name);
        newBook.put("author", author);
        newBook.put("copies", copies);
        arr.add(newBook);
        return new ResponseEntity<>(
                "Book Added Successfully",
                HttpStatus.CREATED);

    }

}
