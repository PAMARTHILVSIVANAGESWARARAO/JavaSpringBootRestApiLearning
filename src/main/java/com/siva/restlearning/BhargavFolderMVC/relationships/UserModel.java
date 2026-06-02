package com.siva.restlearning.BhargavFolderMVC.relationships;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "oto_users")
public class UserModel {


    // Primary Key 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "user_name")
    private String name;

    // Relationship with CartModel ONE TO ONE 
    // CartModel owns the relationship through oto_carts.user_id, which references
    // this entity's oto_users.user_id primary key.
    @OneToOne(mappedBy = "user" , cascade = CascadeType.ALL)
    private CartModel cart;

    

    
}
