package com.siva.restlearning.BhargavFolderMVC.relationships;


import java.util.List;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
// public UserService(UserRepository userRepository) {
//     this.userRepository = userRepository;
// }
public class UserService {

    private final UserRepository userRepository;

    public UserModel save(UserModel user) {
        if (user.getCart() != null) {
            user.getCart().setUser(user);
        }

        return userRepository.save(user);
    }

    public UserModel getById(@NonNull Long id) {
        return userRepository.findById(id)
                .orElseThrow();
    }

    public List<UserModel> getAll() {
        return userRepository.findAll();
    }

    public void delete(@NonNull Long id) {
        userRepository.deleteById(id);
    }
}

