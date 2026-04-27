package com.careerconnect.backend1.controller;

import com.careerconnect.backend1.model.Session;
import com.careerconnect.backend1.service.SessionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/sessions")
public class SessionController {

    @Autowired
    private SessionService sessionService;

    // ✅ 1. SAVE SESSION (your existing feature)
    @PostMapping
    public Session createSession(@RequestBody Session session) {
        System.out.println("Saving session: " + session.getName());
        return sessionService.saveSession(session);
    }

    // ✅ 2. GET ALL SESSIONS (NEW)
    @GetMapping
    public List<Session> getAllSessions() {
        return sessionService.getAllSessions();
    }

    // ✅ 3. GET SESSIONS BY NAME (NEW)
    @GetMapping("/user/{name}")
    public List<Session> getSessionsByName(@PathVariable String name) {
        return sessionService.getSessionsByName(name);
    }

    // ✅ 4. DELETE ALL SESSIONS (FOR TESTING)
    @DeleteMapping("/all")
    public String deleteAllSessions() {
        sessionService.deleteAllSessions();
        return "All sessions deleted successfully";
    }
}