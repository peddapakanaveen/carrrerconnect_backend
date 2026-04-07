package com.careerconnect.backend1.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@CrossOrigin(origins = "http://localhost:5173") // ✅ ADD HERE
@RequestMapping("/careers")
public class CareerController {

    @GetMapping
    public List<Map<String, String>> getCareers() {
        List<Map<String, String>> list = new ArrayList<>();

        list.add(Map.of("id", "1", "title", "Engineering"));
        list.add(Map.of("id", "2", "title", "Medical"));
        list.add(Map.of("id", "3", "title", "Law"));
        list.add(Map.of("id", "4", "title", "Business"));
        list.add(Map.of("id", "5", "title", "Arts"));

        return list;
    }
}