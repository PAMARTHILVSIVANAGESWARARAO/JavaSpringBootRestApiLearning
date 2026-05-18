package com.siva.restlearning.controller;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

@RestController
@RequestMapping("/Library")
public class Library
 {
    //Here Linked HashMap is used to send data as in this order only , if hashmap is used the data is sorted according to keys

    Map<String,String> hm=new LinkedHashMap<>();
    HashMap<String,String> hm1=new HashMap<>();
    HashMap<String,String> hm2=new HashMap<>();
    ArrayList<HashMap<String,String>> arr=new ArrayList<>();

    Library(){
            hm.put("name","Core java");
            hm.put("author","Hoorstmann");
            hm.put("Copies","5");

        hm1.put("name","C primer plus");
        hm1.put("author","stephen");
        hm1.put("copies","10");

        hm2.put("name","python");
        hm2.put("author","Eric");
        hm2.put("copies","7");
        arr.add(hm1);
        arr.add(hm2);

        }
    @GetMapping("/book")
    public Map<String,String> overallBooks()
    {
        
        return hm;
    }
    @GetMapping("/books")
    public ArrayList NoOfBooks() {

        return arr;
    }
    
}
