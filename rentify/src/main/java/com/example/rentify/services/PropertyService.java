package com.example.rentify.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.rentify.entities.Property;
import com.example.rentify.repositories.PropertyRepository;

@Service
public class PropertyService {
    @Autowired
    private PropertyRepository propertyRepository;

    public Property saveProperty(Property property) {
        return propertyRepository.save(property);
    }

    public List<Property> getPropertiesBySeller(Long sellerId) {
        return propertyRepository.findBySellerId(sellerId);
    }

    public void deleteProperty(Long propertyId) {
        propertyRepository.deleteById(propertyId);
    }

    public List<Property> getAllProperties() {
        return propertyRepository.findAll();
    }
}
