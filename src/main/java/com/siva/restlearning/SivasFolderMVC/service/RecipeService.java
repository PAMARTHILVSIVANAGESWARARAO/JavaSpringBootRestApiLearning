package com.siva.restlearning.SivasFolderMVC.service;

import com.siva.restlearning.SivasFolderMVC.dao.RecipeDAO;
import com.siva.restlearning.SivasFolderMVC.model.Recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RecipeService {

    @Autowired
    RecipeDAO recipeDAO;

    public ArrayList<Recipe> getRecipes() {

        return recipeDAO.getRecipes();
    }

    public Recipe addRecipe(Recipe recipe) {

        return recipeDAO.addRecipe(recipe);
    }

    public Recipe updateRecipe(int id, Recipe body) {

        return recipeDAO.updateRecipe(id, body);
    }

    public boolean deleteRecipe(int id) {

        return recipeDAO.deleteRecipe(id);
    }
}