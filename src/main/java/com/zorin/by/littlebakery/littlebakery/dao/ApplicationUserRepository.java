package com.zorin.by.littlebakery.littlebakery.dao;

import com.zorin.by.littlebakery.littlebakery.model.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {

    ApplicationUser findByUsername(String username);
}
