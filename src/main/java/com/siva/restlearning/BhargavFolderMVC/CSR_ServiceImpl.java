package com.siva.restlearning.BhargavFolderMVC;
import java.util.*;
import org.springframework.stereotype.Service;
interface CSR_Service
{
    ArrayList<HashMap<String,Integer>>
    displayAllStudents();
    int totalStudents();

}
@Service
public class CSR_ServiceImpl
implements CSR_Service
{
    CSR_Repository repo =
            new CSR_RepositoryImpl();
    public ArrayList<HashMap<String,Integer>>
    displayAllStudents()
    {
        return repo.getData();
    }
    public int totalStudents()
    {
        ArrayList<HashMap<String,Integer>>
        data=repo.getData();
        return data.size();
    }

}