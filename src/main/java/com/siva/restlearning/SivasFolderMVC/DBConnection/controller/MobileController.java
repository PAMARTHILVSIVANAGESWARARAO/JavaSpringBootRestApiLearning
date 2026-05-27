package com.siva.restlearning.SivasFolderMVC.DBConnection.controller;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siva.restlearning.SivasFolderMVC.DBConnection.model.Mobile;
import com.siva.restlearning.SivasFolderMVC.DBConnection.service.MobileService;

@RestController
@RequestMapping("/api/mobiles")
public class MobileController {
    
    @Autowired
    MobileService mobileService;

    @GetMapping
    public List<Mobile> getAllMobiles() {
        return mobileService.getAllMobiles();
    }

    @GetMapping("/{brand}")
    public List<Mobile> getMobilesByBrand(@PathVariable String brand) {
        return mobileService.getMobilesByBrand(brand);
    }

    
    @PostMapping
    public HashMap<String, Object> addMobile(@RequestBody @NonNull Mobile mobile) {
        return mobileService.addMobile(mobile);
    }

    



    
}
