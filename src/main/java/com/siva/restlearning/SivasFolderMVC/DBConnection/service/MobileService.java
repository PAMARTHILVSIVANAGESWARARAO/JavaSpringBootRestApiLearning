package com.siva.restlearning.SivasFolderMVC.DBConnection.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.autoconfigure.graphql.GraphQlProperties.Http;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.siva.restlearning.SivasFolderMVC.DBConnection.model.Mobile;
// import com.siva.restlearning.SivasFolderMVC.DBConnection.model.Mobile;
import com.siva.restlearning.SivasFolderMVC.DBConnection.repository.MobileRepository;

@Service
public class MobileService {

    @Autowired
    MobileRepository mobileRepository;

   

    public ResponseEntity<?> createMobile(String brand, String model, double price) {
     
        int rowsAffected = mobileRepository.createMobile(brand, model, price);

        if (rowsAffected > 0) {
            return new ResponseEntity<>("Row inserted." , HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("Row Not inserted." , HttpStatus.PARTIAL_CONTENT);
        }
    }



    public ResponseEntity<?> insertMany(List<Mobile> mobiles) {

        int count = 0;
        for(int i = 0 ; i<mobiles.size() ;i++){
            int res = mobileRepository.createMobile(mobiles.get(i).getBrand(), mobiles.get(i).getModel(), mobiles.get(i).getPrice());
            if(res > 0){
                count++;
            }
        }
        return new ResponseEntity<>("No of Rows inserted: " + count, HttpStatus.CREATED);
    }

    public List<Mobile> getMobiles() {
        return mobileRepository.getAll();
    }



    public List<Mobile> getMobileByID(Long id) {
        return mobileRepository.getMobileByID(id);
    }



    public List<Mobile> getMobilesByBrand(String brand) {
        // TODO Auto-generated method stub
        return mobileRepository.getMobilesByBrand(brand);
    }

}
