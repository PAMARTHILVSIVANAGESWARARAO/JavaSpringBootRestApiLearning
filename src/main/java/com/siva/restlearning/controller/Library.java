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
    // LinkedHashMap maintains insertion order
    // HashMap does not guarantee any order
    Map<String, String> hm = new LinkedHashMap<>();
    HashMap<String, String> hm1 = new HashMap<>();
    HashMap<String, String> hm2 = new HashMap<>();
    ArrayList<HashMap<String, String>> arr = new ArrayList<>();

    public Library() {
        hm.put("name", "Core Java");
        hm.put("author", "Horstmann");
        hm.put("copies", "5");

        hm1.put("name", "C primer plus");
        hm1.put("author", "Stephen");
        hm1.put("copies", "10");

        hm2.put("name", "Python");
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
    public ArrayList<HashMap<String, String>> getBooks() {
        return arr;
    }

    // POST Mapping started
    // @RequestBody receives JSON data
    // and stores it inside HashMap called body
    @PostMapping("/book")
    public ResponseEntity<String> addBook(
            @RequestBody HashMap<String, String> body) {
        String name = body.get("name");
        String author = body.get("author");
        String copies = body.get("copies");
        HashMap<String, String> newBook = new HashMap<>();
        newBook.put("name", name);
        newBook.put("author", author);
        newBook.put("copies", copies);
        arr.add(newBook);
        // ResponseEntity sends complete HTTP response
        // including body and status code
        return new ResponseEntity<>(
                "Book Added Successfully",
                HttpStatus.OK);
    }

    // PUT Mapping
    // Used to update existing data
    @PutMapping("/book")
    public ResponseEntity<String> updateBook(
            @RequestBody HashMap<String, String> body) {
        String name = body.get("name");
        String copies = body.get("copies");
        for (HashMap<String, String> book : arr) {
            if (name.equals(book.get("name"))) {
                book.put("copies", copies);
                return new ResponseEntity<>(
                        "Book Updated Successfully",
                        HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(
                "Book Not Found",
                HttpStatus.NOT_FOUND);
    }

    



    // DELETE Mapping
    // Used to delete existing data
    @DeleteMapping("/book")
    public ResponseEntity<String> deleteBook(
            @RequestBody HashMap<String, String> body) {
        String name = body.get("name");
        for (HashMap<String, String> book : arr) {
            if (name.equals(book.get("name"))) {
                arr.remove(book);
                return new ResponseEntity<>(
                        "Book Deleted Successfully",
                        HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(
                "Book Not Found",
                HttpStatus.NOT_FOUND);
    }
}