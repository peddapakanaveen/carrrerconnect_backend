package com.careerconnect.backend1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.careerconnect.backend1.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}