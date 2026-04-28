package com.careerconnect.backend1.controller;

import com.careerconnect.backend1.model.Session;
import com.careerconnect.backend1.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sessions")
@CrossOrigin(origins = "*")
public class SessionController {

    @Autowired
    private SessionRepository repo;

    // ✅ TEST API (for Railway check)
    @GetMapping("/test")
    public String test() {
        return "Backend is working";
    }

    // ✅ SAVE SESSION
    @PostMapping
    public Session saveSession(@RequestBody Session session) {
        return repo.save(session);
    }

    // ✅ GET ALL SESSIONS
    @GetMapping
    public List<Session> getAllSessions() {
        return repo.findAll();
    }
}