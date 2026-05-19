package com.siva.restlearning.controller;

import java.util.LinkedHashMap;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/recipes")
public class Recipe {

    LinkedHashMap<String, ArrayList<LinkedHashMap<String, Object>>> recipe = new LinkedHashMap<>();

    Recipe() {
        ArrayList<LinkedHashMap<String, Object>> al = new ArrayList<>();


        for (int i = 1; i < 10; i++) {

            LinkedHashMap<String, Object> lm = new LinkedHashMap<>();

            lm.put("id", i);
            lm.put("name", ("Product" + i));
            lm.put("price", (i * 10.287));

            ArrayList<String> al2 = new ArrayList<>();
            al2.add("Condition evaluation unchanged");
            al2.add("Condition evaluation unchanged");
           

            lm.put("steps", al2);

            al.add(lm);
        }

        recipe.put("recipe", al);

    }

    @GetMapping
    public ResponseEntity<?> getRecipes() {

        return new ResponseEntity<>(recipe, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> addRecipe(
            @RequestBody LinkedHashMap<String, Object> body) {

        ArrayList<LinkedHashMap<String, Object>> al2 = recipe.get("recipe");

        LinkedHashMap<String, Object> lm = new LinkedHashMap<>();

        int id = Integer.parseInt(body.get("id").toString());

        String name = body.get("name").toString();

        double price = Double.parseDouble(body.get("price").toString());

        lm.put("id", id);
        lm.put("name", name);
        lm.put("price", price);

        al2.add(lm);
        System.out.println("Recipe added successfully");
        return new ResponseEntity<>(lm, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateRecipe(
            @PathVariable int id,
            @RequestBody LinkedHashMap<String, Object> body) {
        ArrayList<LinkedHashMap<String, Object>> al2 = recipe.get("recipe");
        for (LinkedHashMap<String, Object> lm : al2) {
            if (Integer.parseInt(lm.get("id").toString()) == id) {
                String name = body.get("name").toString();
                double price = Double.parseDouble(body.get("price").toString());

                lm.put("name", name);
                lm.put("price", price);

                System.out.println("Recipe updated successfully");
                return new ResponseEntity<>(lm, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("Recipe not found", HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteRecipe(@PathVariable int id) {
        ArrayList<LinkedHashMap<String, Object>> al2 = recipe.get("recipe");
        for (LinkedHashMap<String, Object> lm : al2) {
            if (Integer.parseInt(lm.get("id").toString()) == id) {
                al2.remove(lm);
                System.out.println("Recipe deleted successfully");
                return new ResponseEntity<>("Recipe deleted successfully", HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("Recipe not found", HttpStatus.NOT_FOUND);
    }

}