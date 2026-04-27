package com.careerconnect.backend1.controller;

import com.careerconnect.backend1.model.User;
import com.careerconnect.backend1.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    // ✅ SIGNUP
    @PostMapping("/signup")
    public User signup(@RequestBody User user) {

        System.out.println("Signup Email: " + user.getEmail());

        if (user.getEmail() == null || user.getPassword() == null) {
            throw new RuntimeException("Email or password cannot be empty");
        }

        return userService.saveUser(user);
    }

    // ✅ LOGIN (MULTIPLE USERS SUPPORT)
    @PostMapping("/login")
    public User login(@RequestBody User user) {

        System.out.println("Login Email: " + user.getEmail());

        if (user.getEmail() == null || user.getPassword() == null) {
            throw new RuntimeException("Email or password missing");
        }

        // ✅ FETCH USER FROM DATABASE
        User existingUser = userService.findByEmail(user.getEmail());

        if (existingUser == null) {
            throw new RuntimeException("User not found");
        }

        if (!existingUser.getPassword().equals(user.getPassword())) {
            throw new RuntimeException("Wrong password");
        }

        return existingUser; // ✅ ANY USER CAN LOGIN
    }
}