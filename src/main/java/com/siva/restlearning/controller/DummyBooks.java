package com.siva.restlearning.controller;

import java.util.LinkedHashMap;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/booksdata")
public class DummyBooks {
    LinkedHashMap<String, ArrayList<LinkedHashMap<String, Object>>> hm = new LinkedHashMap<>();

    DummyBooks() {
        ArrayList<LinkedHashMap<String, Object>> arr = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            LinkedHashMap<String, Object> hm1 = new LinkedHashMap<>();
            hm1.put("serialNo", i);
            hm1.put("name", "Book " + i);
            if (i % 2 == 0)
                hm1.put("category", "Programming");
            else
                hm1.put("category", "Science");
            hm1.put(
                    "description",
                    "This is description of Book " + i);
            arr.add(hm1);
        }
        hm.put("books", arr);
    }

    @GetMapping
    public ResponseEntity<?> getBooks() {
        return new ResponseEntity<>(
                hm,
                HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> addBook(
            @RequestBody LinkedHashMap<String, Object> body) {
        ArrayList<LinkedHashMap<String, Object>> arr = hm.get("books");
        LinkedHashMap<String, Object> hm = new LinkedHashMap<>();
        int serialNo = Integer.parseInt(
                body.get("serialNo").toString());
        String name = body.get("name").toString();
        String category = body.get("category").toString();
        String description = body.get("description").toString();
        hm.put("serialNo", serialNo);
        hm.put("name", name);
        hm.put("category", category);
        hm.put("description", description);
        arr.add(hm);
        System.out.println(
                "Book added successfully");
        return new ResponseEntity<>(
                hm,
                HttpStatus.CREATED);
    }

    @PutMapping("/{serialNo}")
    public ResponseEntity<?> updateBook(
            @PathVariable int serialNo,
            @RequestBody LinkedHashMap<String, Object> body) {
        ArrayList<LinkedHashMap<String, Object>> arr = hm.get("books");
        for (LinkedHashMap<String, Object> hm : arr) {
            if (Integer.parseInt(
                    hm.get("serialNo")
                            .toString()) == serialNo) {
                String name = body.get("name")
                        .toString();
                String category = body.get("category")
                        .toString();
                String description = body.get("description")
                        .toString();
                hm.put("name", name);
                hm.put("category", category);
                hm.put(
                        "description",
                        description);
                return new ResponseEntity<>(
                        hm,
                        HttpStatus.OK);
            }
        }

        return new ResponseEntity<>(
                "Book not found",
                HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{serialNo}")
    public ResponseEntity<?> deleteBook(
            @PathVariable int serialNo) {

        ArrayList<LinkedHashMap<String, Object>> arr = hm.get("books");

        for (LinkedHashMap<String, Object> hm : arr) {

            if (Integer.parseInt(
                    hm.get("serialNo")
                            .toString()) == serialNo) {

                arr.remove(hm);

                return new ResponseEntity<>(
                        "Book deleted successfully",
                        HttpStatus.OK);
            }
        }

        return new ResponseEntity<>(
                "Book not found",
                HttpStatus.NOT_FOUND);
    }
}