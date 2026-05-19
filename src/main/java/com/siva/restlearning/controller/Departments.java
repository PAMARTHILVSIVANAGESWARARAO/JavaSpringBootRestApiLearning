package com.siva.restlearning.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
// import java.util.ArrayList;
@RestController
@RequestMapping("/departments")
public class Departments {
    HashMap<String , String> departments = new HashMap<>();
    //constructor is called when you need to intize  the data through  datastructures
    Departments() {
    
    departments.put("CSE", "Computer Science and Engineering");

    departments.put("ECE", "Electronics and Communication Engineering");

    departments.put("ME", "Mechanical Engineering");

  

    }


    @GetMapping
    public HashMap<String, String> getDepartments() {
        
        return departments;
    }
    

    @PostMapping
    public ResponseEntity<String> B(@RequestBody HashMap<String , String> body) {
        String branch = body.get("branch");
        String ff = body.get("ff");
        departments.put(branch , ff );

        return new ResponseEntity<>("Branch Added Successfully", HttpStatus.CREATED);
    }

    @PutMapping("/{branch}")
    public ResponseEntity<String> updateDepartment(@PathVariable String branch, @RequestBody HashMap<String , String> body) {
        String newName = body.get("newName");
        if (departments.containsKey(branch)) {
            departments.put(branch, newName);
            return new ResponseEntity<>("Department updated successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Department not found", HttpStatus.NOT_FOUND);

        }
    }

    @DeleteMapping("/{branch}")
    public ResponseEntity<String> deleteDepartment(@PathVariable String branch) {
        if (departments.containsKey(branch)) {
            departments.remove(branch);
            return new ResponseEntity<>("Department deleted successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Department not found", HttpStatus.NOT_FOUND);  
        }
    }
    

    


    
}
