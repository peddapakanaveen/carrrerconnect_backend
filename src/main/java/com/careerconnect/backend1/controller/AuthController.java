package com.careerconnect.backend1.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> user) {

        String email = user.get("email");
        String password = user.get("password");

        // ✅ Null safety check (VERY IMPORTANT)
        if (email == null || password == null) {
            throw new RuntimeException("Email or password is missing");
        }

        // ✅ Simple login check
        if (email.equals("test@gmail.com") && password.equals("1234")) {
            return Map.of(
                "name", "Sasi",
                "email", email
            );
        }

        throw new RuntimeException("Invalid credentials");
    }
}