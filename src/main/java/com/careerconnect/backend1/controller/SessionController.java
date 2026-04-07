package com.careerconnect.backend1.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/sessions")
public class SessionController {

    private List<Map<String, String>> sessions = new ArrayList<>();

    // ✅ Book Session
    @PostMapping
    public Map<String, String> bookSession(@RequestBody Map<String, String> data) {
        sessions.add(data);
        return Map.of("message", "Session booked successfully");
    }

    // ✅ Get All Sessions
    @GetMapping
    public List<Map<String, String>> getSessions() {
        return sessions;
    }
}