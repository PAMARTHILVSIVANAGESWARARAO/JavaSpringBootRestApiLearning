package com.siva.restlearning.BhargavFolderMVC.relationships;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
    
}
