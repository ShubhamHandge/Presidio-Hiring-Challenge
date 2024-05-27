package com.example.rentify.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.rentify.entities.Property;
import com.example.rentify.services.PropertyService;

@RestController
@RequestMapping("/api/properties")
public class PropertyController {
    @Autowired
    private PropertyService propertyService;

    @PostMapping("/add")
    public ResponseEntity<?> addProperty(@RequestBody Property property) {
        propertyService.saveProperty(property);
        return new ResponseEntity<>("Property added successfully", HttpStatus.OK);
    }

    @GetMapping("/seller/{sellerId}")
    public List<Property> getPropertiesBySeller(@PathVariable Long sellerId) {
        return propertyService.getPropertiesBySeller(sellerId);
    }

    @DeleteMapping("/delete/{propertyId}")
    public ResponseEntity<?> deleteProperty(@PathVariable Long propertyId) {
        propertyService.deleteProperty(propertyId);
        return new ResponseEntity<>("Property deleted successfully", HttpStatus.OK);
    }

    @GetMapping("/all")
    public List<Property> getAllProperties() {
        return propertyService.getAllProperties();
    }
}
