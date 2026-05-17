package com.siva.restlearning.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/students")
public class StudentController {

    HashMap<Integer, String> students = new HashMap<>();

    @GetMapping
    public HashMap<Integer, String> getStudents() {
        System.out.println("Getting all students");
        
        return students;
    }

    @PostMapping
    public String addStudent(@RequestBody Map<String, String> body) {

        int id = Integer.parseInt(body.get("id"));
        String name = body.get("name");

        students.put(id, name);

        System.out.println("A new Student is added with id: " + id + " and name: " + name);
        return "Student Added Successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {

        students.remove(id);

        System.out.println("Student deleted with id: " + id);
        return "Student Deleted";
    }
}