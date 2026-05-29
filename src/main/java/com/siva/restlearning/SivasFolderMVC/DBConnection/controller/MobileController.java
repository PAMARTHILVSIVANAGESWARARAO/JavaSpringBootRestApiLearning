package com.siva.restlearning.SivasFolderMVC.DBConnection.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siva.restlearning.SivasFolderMVC.DBConnection.model.Mobile;
import com.siva.restlearning.SivasFolderMVC.DBConnection.service.MobileService;

import io.micrometer.common.lang.NonNull;

@RestController
@RequestMapping("/api/mobiles")
public class MobileController {

    @Autowired
    MobileService mobileService;

    @GetMapping
    public List<Mobile> getMobiles() {
        return mobileService.getMobiles();
    }

    @GetMapping("/getByID/{id}")
    public List<Mobile> getMobileByID(@NonNull @PathVariable Long id) {
        return mobileService.getMobileByID(id);
    }
    
    @GetMapping("/getAllByBrand/{brand}")
    public List<Mobile> getMobilesByBrand(@NonNull @PathVariable String brand) {
        return mobileService.getMobilesByBrand(brand);
    }

    @PostMapping
    public ResponseEntity<?> createMobile(@NonNull @RequestBody Mobile mobile) {
        return mobileService.createMobile(mobile.getBrand(), mobile.getModel(), mobile.getPrice());
    }

    @PostMapping("/insertMany")
    public ResponseEntity<?> insertMany(@NonNull @RequestBody ArrayList<Mobile> mobiles) {

        return mobileService.insertMany(mobiles);

    }

}
