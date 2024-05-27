package com.example.rentify.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.rentify.entities.Interested;

public interface InterestedRepository extends JpaRepository<Interested, Long> {
    List<Interested> findByPropertyId(Long propertyId);
}
