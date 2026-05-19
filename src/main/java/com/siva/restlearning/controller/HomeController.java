 package com.siva.restlearning.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    HashMap<String , String> hm = new HashMap<>();
    HashMap<String , String> hm2 = new HashMap<>();
    public HomeController() {

        hm.put("message", "API is working");
        hm2.put("message", "API is healthy");
    }
    @GetMapping
    public HashMap<String, String> home() {
        System.out.println("HomeController.home() called");
        return hm;
    }
    @GetMapping("/health")
    public HashMap<String, String> health() {
        return hm2;
    }
}

