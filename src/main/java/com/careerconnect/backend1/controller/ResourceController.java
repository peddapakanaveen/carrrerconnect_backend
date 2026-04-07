package com.careerconnect.backend1.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@CrossOrigin(origins = "http://localhost:5173") // ✅ ADD HERE
@RequestMapping("/resources")
public class ResourceController {

    @GetMapping
    public List<Map<String, String>> getResources() {
        List<Map<String, String>> list = new ArrayList<>();

        list.add(Map.of("id", "1", "title", "Career Guidance PDF", "description", "Guide for careers"));
        list.add(Map.of("id", "2", "title", "Resume Template", "description", "Professional resume"));
        list.add(Map.of("id", "3", "title", "Interview Tips", "description", "Interview preparation"));

        return list;
    }
}