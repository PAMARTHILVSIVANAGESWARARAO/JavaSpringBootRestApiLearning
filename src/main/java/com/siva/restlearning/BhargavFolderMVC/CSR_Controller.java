package com.siva.restlearning.BhargavFolderMVC;
import java.util.*;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/csr")
public class CSR_Controller
{
    CSR_Service service =
            new CSR_ServiceImpl();
    @GetMapping("/all")
    public ArrayList<HashMap<String,Integer>>
    showStudents()
    {
        return service.displayAllStudents();
    }
    @GetMapping("/count")
    public int countStudents()
    {
        return service.totalStudents();
    }
}