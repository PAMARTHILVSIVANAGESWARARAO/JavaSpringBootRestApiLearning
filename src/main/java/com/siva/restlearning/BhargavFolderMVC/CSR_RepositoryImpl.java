package com.siva.restlearning.BhargavFolderMVC;
import java.util.*;
import org.springframework.stereotype.Repository;

interface CSR_Repository
{
    ArrayList<HashMap<String,Integer>> getData();
}

@Repository
public class CSR_RepositoryImpl
implements CSR_Repository
{
    public ArrayList<HashMap<String,Integer>> getData()
    {
        HashMap<String,Integer> hm1 =
                new HashMap<>();
        hm1.put("Rahul",20);
        HashMap<String,Integer> hm2 =
                new HashMap<>();
        hm2.put("Priya",21);
        HashMap<String,Integer> hm3 =
                new HashMap<>();
        hm3.put("Arjun",22);
        ArrayList<HashMap<String,Integer>> students=
                new ArrayList<>();
        students.add(hm1);
        students.add(hm2);
        students.add(hm3);
        return students;

    }

}