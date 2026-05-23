package com.siva.restlearning.SivasFolderMVC.model;

import java.util.ArrayList;
import java.util.TreeMap;

public class Product {

    private Integer id;

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    private Double price;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    private Double discountPercentage;

    public Double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(Double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    private Double rating;

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    private Integer stock;

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    private ArrayList<String> tags;

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private String sku;

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    private Integer weight;

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    private TreeMap<String, Double> dimensions;

    public TreeMap<String, Double> getDimensions() {
        return dimensions;
    }

    public void setDimensions(TreeMap<String, Double> dimensions) {
        this.dimensions = dimensions;
    }

    private String warrentyInformation;

    public String getWarrentyInformation() {
        return warrentyInformation;
    }

    public void setWarrentyInformation(String warrentyInformation) {
        this.warrentyInformation = warrentyInformation;
    }

    private String shippingInformation;

    public String getShippingInformation() {
        return shippingInformation;
    }

    public void setShippingInformation(String shippingInformation) {
        this.shippingInformation = shippingInformation;
    }

    private String availabilityStatus;

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public Product() {
    }

    public Product(Integer id, String title, String description, String category, Double price,
            Double discountPercentage, Double rating, Integer stock, ArrayList<String> tags, String brand, String sku,
            Integer weight, TreeMap<String, Double> dimensions, String warrentyInformation, String shippingInformation,
            String availabilityStatus) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.price = price;
        this.discountPercentage = discountPercentage;
        this.rating = rating;
        this.stock = stock;
        this.tags = tags;
        this.brand = brand;
        this.sku = sku;
        this.weight = weight;
        this.dimensions = dimensions;
        this.warrentyInformation = warrentyInformation;
        this.shippingInformation = shippingInformation;
        this.availabilityStatus = availabilityStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
