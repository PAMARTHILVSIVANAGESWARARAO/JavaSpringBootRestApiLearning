package com.siva.restlearning.SivasFolderMVC.DBConnection.controller;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @PostMapping("addbyquery")
    public String addMobileByQuery(@RequestBody @NonNull Mobile mobile) {
        return mobileService.addMobileByQuery(mobile);

    }

    @PostMapping("insertManybyQuery")
    public ResponseEntity<?> insertManyMobilesByQuery(@RequestBody List<Mobile> mobiles) {
        
       

        for (Mobile mobile : mobiles) {
            mobileService.addMobileByQuery(mobile);
        }

        // Same ResponseEntity Can Be Created Using ResponseEntity.ok() Method Which Sets The Status To 200 Automatically

        // return new ResponseEntity<>("Mobiles added successfully", HttpStatus.OK);
        return ResponseEntity.status(200).body("Mobiles added successfully");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateMobile(@PathVariable @NonNull Long id, @RequestBody Mobile mobile) {
        return mobileService.updateMobile(id, mobile);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMobile(@PathVariable @NonNull Long id) {
        return mobileService.deleteMobile(id);
    }

    



    
}
