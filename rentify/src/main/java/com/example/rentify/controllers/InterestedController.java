package com.example.rentify.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.rentify.entities.Interested;
import com.example.rentify.services.InterestedService;

@RestController
@RequestMapping("/api/interested")
public class InterestedController {
    @Autowired
    private InterestedService interestedService;

    @PostMapping("/add")
    public ResponseEntity<?> addInterested(@RequestBody Interested interested) {
        interestedService.saveInterested(interested);
        return new ResponseEntity<>("Interested added successfully", HttpStatus.OK);
    }

    @GetMapping("/property/{propertyId}")
    public List<Interested> getInterestedByProperty(@PathVariable Long propertyId) {
        return interestedService.getInterestedByProperty(propertyId);
    }
}
