package com.example.rentify.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.rentify.entities.Interested;
import com.example.rentify.repositories.InterestedRepository;

@Service
public class InterestedService {
    @Autowired
    private InterestedRepository interestedRepository;

    public Interested saveInterested(Interested interested) {
        return interestedRepository.save(interested);
    }

    public List<Interested> getInterestedByProperty(Long propertyId) {
        return interestedRepository.findByPropertyId(propertyId);
    }
}
