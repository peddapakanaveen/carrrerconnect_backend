package com.careerconnect.backend1.service;

import com.careerconnect.backend1.model.User;
import com.careerconnect.backend1.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // ✅ SAVE USER
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // ✅ FIND USER BY EMAIL
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}