package com.careerconnect.backend1.service;

import com.careerconnect.backend1.model.Session;
import com.careerconnect.backend1.repository.SessionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionService {

    @Autowired
    private SessionRepository sessionRepository;

    public Session saveSession(Session session) {
        return sessionRepository.save(session);
    }

    // ✅ NEW METHODS

    public List<Session> getAllSessions() {
        return sessionRepository.findAll();
    }

    public List<Session> getSessionsByName(String name) {
        return sessionRepository.findByName(name);
    }

    public void deleteAllSessions() {
        sessionRepository.deleteAll();
    }
}