package com.example.rentify.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.rentify.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
