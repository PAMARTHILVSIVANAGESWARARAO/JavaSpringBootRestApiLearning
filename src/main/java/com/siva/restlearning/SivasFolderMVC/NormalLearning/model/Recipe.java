package com.siva.restlearning.SivasFolderMVC.NormalLearning.model;

import java.util.ArrayList;

public class Recipe {

    private int id;

    private String name;

    private double price;

    private ArrayList<String> steps;

    public Recipe() {
    }

    public Recipe(int id, String name, double price, ArrayList<String> steps) {

        this.id = id;
        this.name = name;
        this.price = price;
        this.steps = steps;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<String> getSteps() {
        return steps;
    }

    public void setSteps(ArrayList<String> steps) {
        this.steps = steps;
    }
}