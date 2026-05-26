package com.siva.restlearning.SivasFolderMVC.NormalLearning.dao;

import com.siva.restlearning.SivasFolderMVC.NormalLearning.model.Recipe;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class RecipeDAO {

    ArrayList<Recipe> recipes = new ArrayList<>();

    public RecipeDAO() {

        for (int i = 1; i < 10; i++) {

            ArrayList<String> steps = new ArrayList<>();

            steps.add("Step 1");
            steps.add("Step 2");

            Recipe recipe = new Recipe(
                    i,
                    "Product" + i,
                    i * 10.5,
                    steps
            );

            recipes.add(recipe);
        }
    }

    public ArrayList<Recipe> getRecipes() {

        return recipes;
    }

    public Recipe addRecipe(Recipe recipe) {

        recipes.add(recipe);

        return recipe;
    }

    public Recipe updateRecipe(int id, Recipe body) {

        for (Recipe recipe : recipes) {

            if (recipe.getId() == id) {

                recipe.setName(body.getName());

                recipe.setPrice(body.getPrice());

                recipe.setSteps(body.getSteps());

                return recipe;
            }
        }

        return null;
    }

    public boolean deleteRecipe(int id) {

        for (Recipe recipe : recipes) {

            if (recipe.getId() == id) {

                recipes.remove(recipe);

                return true;
            }
        }

        return false;
    }
}