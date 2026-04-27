package com.careerconnect.backend1.repository;

import com.careerconnect.backend1.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SessionRepository extends JpaRepository<Session, Long> {

    // ✅ NEW METHOD
    List<Session> findByName(String name);
}