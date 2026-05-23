package com.siva.restlearning.BhargavFolderMVC;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/library")

public class Library_Controller
{
    @Autowired

       Library_ServiceImpl_CSR service;


    @GetMapping("/all")

    public ArrayList<HashMap<String,String>>
    showBooks()
    {

        return service.displayAllBooks();

    }


    @GetMapping("/count")

    public int countBooks()
    {

        return service.totalBooks();

    }


    @GetMapping("/search/{id}")

    public HashMap<String,String>
    searchBook(
            @PathVariable String id)
    {

        return service.searchBookById(id);

    }


    @GetMapping("/check/{name}")

    public boolean checkBook(
            @PathVariable String name)
    {

        return service.bookExists(name);

    }

}