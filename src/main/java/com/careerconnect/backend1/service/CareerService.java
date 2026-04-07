package com.careerconnect.backend1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.careerconnect.backend1.model.Career;
import com.careerconnect.backend1.repository.CareerRepository;

@Service
public class CareerService {

    @Autowired
    private CareerRepository repo;

    public List<Career> getAllCareers() {
        return repo.findAll();
    }

    public Career saveCareer(Career career) {
        return repo.save(career);
    }
}