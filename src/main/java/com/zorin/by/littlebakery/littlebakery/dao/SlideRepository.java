package com.zorin.by.littlebakery.littlebakery.dao;

import com.zorin.by.littlebakery.littlebakery.model.Slide;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SlideRepository extends JpaRepository<Slide, Long> {
    List<Slide> findAllByOrderByIdDesc();
}
