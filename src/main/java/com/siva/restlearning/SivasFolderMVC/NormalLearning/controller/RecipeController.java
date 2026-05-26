package com.siva.restlearning.SivasFolderMVC.NormalLearning.controller;

import com.siva.restlearning.SivasFolderMVC.NormalLearning.model.Recipe;
import com.siva.restlearning.SivasFolderMVC.NormalLearning.service.RecipeService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/siva/recipe")
public class RecipeController {

    @Autowired
    RecipeService recipeService;

    @GetMapping
    public ResponseEntity<?> getRecipes() {

        return new ResponseEntity<>(
                recipeService.getRecipes(),
                HttpStatus.OK
        );
    }

    @PostMapping
    public ResponseEntity<?> addRecipe(
            @RequestBody Recipe recipe) {

        return new ResponseEntity<>(
                recipeService.addRecipe(recipe),
                HttpStatus.CREATED
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateRecipe(
            @PathVariable int id,
            @RequestBody Recipe recipe) {

        Recipe updatedRecipe =
                recipeService.updateRecipe(id, recipe);

        if (updatedRecipe != null) {

            return new ResponseEntity<>(
                    updatedRecipe,
                    HttpStatus.OK
            );
        }

        return new ResponseEntity<>(
                "Recipe Not Found",
                HttpStatus.NOT_FOUND
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteRecipe(
            @PathVariable int id) {

        boolean deleted =
                recipeService.deleteRecipe(id);

        if (deleted) {

            return new ResponseEntity<>(
                    "Recipe Deleted",
                    HttpStatus.OK
            );
        }

        return new ResponseEntity<>(
                "Recipe Not Found",
                HttpStatus.NOT_FOUND
        );
    }
}