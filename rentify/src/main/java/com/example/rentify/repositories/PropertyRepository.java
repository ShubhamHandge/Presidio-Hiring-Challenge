package com.example.rentify.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.rentify.entities.Property;

public interface PropertyRepository extends JpaRepository<Property, Long> {
    List<Property> findBySellerId(Long sellerId);
}
