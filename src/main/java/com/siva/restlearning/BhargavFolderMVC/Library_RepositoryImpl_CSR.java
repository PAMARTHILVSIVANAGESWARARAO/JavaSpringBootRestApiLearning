package com.siva.restlearning.BhargavFolderMVC;

import java.util.*;
import org.springframework.stereotype.Repository;

interface Library_Repository
{
    ArrayList<HashMap<String,String>> getBooks();
}


@Repository
public class Library_RepositoryImpl_CSR
implements Library_Repository
{

    public ArrayList<HashMap<String,String>> getBooks()
    {


        HashMap<String,String> hm1 =
                new HashMap<>();

        hm1.put("BookId","B101");
        hm1.put("BookName","Java Fundamentals");
        hm1.put("Author","James Gosling");
        hm1.put("Category","Programming");


        HashMap<String,String> hm2 =
                new HashMap<>();

        hm2.put("BookId","B102");
        hm2.put("BookName","Spring Boot Basics");
        hm2.put("Author","Rod Johnson");
        hm2.put("Category","Framework");


        HashMap<String,String> hm3 =
                new HashMap<>();

        hm3.put("BookId","B103");
        hm3.put("BookName","Database Systems");
        hm3.put("Author","Korth");
        hm3.put("Category","Database");


        HashMap<String,String> hm4 =
                new HashMap<>();

        hm4.put("BookId","B104");
        hm4.put("BookName","Computer Networks");
        hm4.put("Author","Forouzan");
        hm4.put("Category","Networking");


        HashMap<String,String> hm5 =
                new HashMap<>();

        hm5.put("BookId","B105");
        hm5.put("BookName","Operating Systems");
        hm5.put("Author","Galvin");
        hm5.put("Category","System");


        ArrayList<HashMap<String,String>> books =
                new ArrayList<>();


        books.add(hm1);
        books.add(hm2);
        books.add(hm3);
        books.add(hm4);
        books.add(hm5);



        return books;

    }

}