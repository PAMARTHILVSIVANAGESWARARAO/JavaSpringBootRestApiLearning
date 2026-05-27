package com.siva.restlearning.SivasFolderMVC.DBConnection.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.siva.restlearning.SivasFolderMVC.DBConnection.model.Mobile;

public interface MobileRepository extends JpaRepository<Mobile, Long> {

    @Query(value = "SELECT * FROM mobile_information", nativeQuery = true)
    List<Mobile> getAllData();

    // Automaatically implemented by Spring Data JPA based on method name
    List<Mobile> findByBrand(String brand); 

    
}
