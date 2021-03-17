package com.restservice.borbon.repository;

import com.restservice.borbon.entity.EmailAge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailAgeRepository extends JpaRepository<EmailAge, String> {

    EmailAge findByEmail(String email);
}
