package com.siva.restlearning;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
    @GetMapping
    public HashMap<String, String> Home() {
        HashMap<String, String> home = new HashMap<>();
        home.put("message", " Api is Working Fine..");
        return home;
    }

    @GetMapping("*")
    public HashMap<String,String> InvalidRoute(){
        HashMap<String,String> hm = new HashMap<>();
        hm.put("message", "Invalid Route , route does n t exists ");
        return hm;
    }
}
