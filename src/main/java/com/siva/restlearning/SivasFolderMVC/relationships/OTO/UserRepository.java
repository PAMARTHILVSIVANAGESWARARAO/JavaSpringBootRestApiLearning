package com.siva.restlearning.SivasFolderMVC.relationships.OTO;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
    
}
