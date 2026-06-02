package com.siva.restlearning.BhargavFolderMVC.relationships;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("oto/users")
@RequiredArgsConstructor

public class UserController {

    private final UserService userService;

    @PostMapping
    public UserModel save(
            @RequestBody UserModel user) {

        return userService.save(user);
    }

    @GetMapping("/{id}")
    public UserModel getById(
            @PathVariable Long id) {

        return userService.getById(id);
    }

    @GetMapping
    public List<UserModel> getAll() {

        return userService.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(
            @PathVariable Long id) {

        userService.delete(id);
    }
}
