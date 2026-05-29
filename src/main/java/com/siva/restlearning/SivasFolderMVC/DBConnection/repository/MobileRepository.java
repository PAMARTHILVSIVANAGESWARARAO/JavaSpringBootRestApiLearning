package com.siva.restlearning.SivasFolderMVC.DBConnection.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.siva.restlearning.SivasFolderMVC.DBConnection.model.Mobile;

import jakarta.transaction.Transactional;

public interface MobileRepository extends JpaRepository<Mobile, Long> {
   
    @Transactional
    @Modifying
    @Query(value = "INSERT INTO mobile_information (brand, model, price) VALUES (?1, ?2, ?3)", nativeQuery = true)
    int createMobile(String brand, String model, double price);

    @Query(value = "SELECT * FROM mobile_information", nativeQuery = true)
    List<Mobile> getAll();

    @Query(value = "SELECT * FROM mobile_information WHERE id = ?1", nativeQuery = true)
    List<Mobile> getMobileByID(Long id);

    @Query(value = "SELECT * FROM mobile_information WHERE brand = ?1", nativeQuery = true)
    List<Mobile> getMobilesByBrand(String brand);

    List<Mobile> findByBrand(String brand);
    
}
