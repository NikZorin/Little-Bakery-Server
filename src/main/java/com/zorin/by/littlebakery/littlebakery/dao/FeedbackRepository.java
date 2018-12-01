package com.zorin.by.littlebakery.littlebakery.dao;

import com.zorin.by.littlebakery.littlebakery.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    List<Feedback> getAllByOrderByIdDesc();
}
