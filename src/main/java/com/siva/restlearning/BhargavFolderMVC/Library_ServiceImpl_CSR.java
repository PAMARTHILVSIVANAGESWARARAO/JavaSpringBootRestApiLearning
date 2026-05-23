package com.siva.restlearning.BhargavFolderMVC;

import java.util.*;
import org.springframework.stereotype.Service;


interface Library_Service
{

    ArrayList<HashMap<String,String>>
    displayAllBooks();


    int totalBooks();


    HashMap<String,String>
    searchBookById(String id);



    boolean bookExists(String name);

}



@Service
public class Library_ServiceImpl_CSR
implements Library_Service
{


    Library_Repository repo =
            new Library_RepositoryImpl_CSR();


    public ArrayList<HashMap<String,String>>
    displayAllBooks()
    {

        return repo.getBooks();

    }

    public int totalBooks()
    {

        ArrayList<HashMap<String,String>>
        data = repo.getBooks();


        return data.size();

    }


    public HashMap<String,String>
    searchBookById(String id)
    {

        ArrayList<HashMap<String,String>>
        data = repo.getBooks();



        for(HashMap<String,String> hm : data)
        {

            if(hm.get("BookId").equals(id))
            {
                return hm;
            }

        }


        return null;

    }

    public boolean bookExists(String name)
    {

        ArrayList<HashMap<String,String>>
        data = repo.getBooks();



        for(HashMap<String,String> hm : data)
        {

            if(hm.get("BookName").equals(name))
            {
                return true;
            }

        }


        return false;

    }

}