package com.example.restapp.service;

import com.example.restapp.entity.User;
import com.example.restapp.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
       private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User getById(int id){
        return this.userRepository.findById(id).orElseThrow();
    }
}
