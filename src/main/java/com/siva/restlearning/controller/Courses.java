package com.siva.restlearning.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import java.util.HashMap;

@RestController
@RequestMapping("/courses")
public class Courses {
    HashMap<String, String> courses = new HashMap<>();
    
    //Witout Status Code
    @GetMapping
    public HashMap<String, String> getCourses() {
        System.out.println("Getting all courses");
        return courses;
    }

    //With Status Code and specifc Routing 
    @PostMapping("/post")
    public ResponseEntity<String> addCourse(@RequestBody String name) {

        courses.put(name, name);

        System.out.println("A new course is added with name: " + name);

        return new ResponseEntity<>("Course Added Successfully", HttpStatus.CREATED);

    }
}
