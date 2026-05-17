package com.siva.restlearning.controller;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
    ArrayList<String> teachers = new ArrayList<>();
    TeacherController() {

        teachers.add("aMr. Smith");
        teachers.add("Ms. Johnson");
        teachers.add("Dr. Williams");
    }

    @GetMapping
    public ArrayList<String> getTeachers() {
        System.out.println("Getting all teachers");
        return teachers;
    }
    @PostMapping
    public String addTeacher(@RequestBody String name) {
        teachers.add(name);
        System.out.println("A new Teacher is added with name: " + name);
        return "Teacher Added Successfully";
    }
    @DeleteMapping("/{name}")
    public String deleteTeacher(@PathVariable String name) {
        teachers.remove(name);
        System.out.println("Teacher deleted with name: " + name);
        return "Teacher Deleted";
    }
}
