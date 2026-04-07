package com.careerconnect.backend1.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@CrossOrigin(origins = "http://localhost:5173") // ✅ ADD HERE

@RequestMapping("/users")
public class UserController {

    @GetMapping("/profile")
    public Map<String, String> getProfile() {
        return Map.of(
            "name", "Sasi",
            "email", "sasi@gmail.com"
        );
    }
}