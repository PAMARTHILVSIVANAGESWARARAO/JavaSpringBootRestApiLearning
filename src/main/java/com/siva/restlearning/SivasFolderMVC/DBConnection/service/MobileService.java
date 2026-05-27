package com.siva.restlearning.SivasFolderMVC.DBConnection.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.siva.restlearning.SivasFolderMVC.DBConnection.model.Mobile;
import com.siva.restlearning.SivasFolderMVC.DBConnection.repository.MobileRepository;

@Service
public class MobileService {

    @Autowired
    MobileRepository mobileRepository;


    public List<Mobile> getAllMobiles() {
        return mobileRepository.getAllData();
    }


    public HashMap<String, Object> addMobile(@NonNull Mobile mobile) {
        mobileRepository.save(mobile);
        HashMap<String, Object> response = new HashMap<>();
        response.put("message", "Mobile added successfully");
        response.put("mobile", mobile);
        return response;
    }


    public List<Mobile> getMobilesByBrand(String brand) {
        return mobileRepository.findByBrand(brand);
    }

}
