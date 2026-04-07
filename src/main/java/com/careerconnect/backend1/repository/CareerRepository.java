package com.careerconnect.backend1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.careerconnect.backend1.model.Career;

public interface CareerRepository extends JpaRepository<Career, Long> {
}