package com.zorin.by.littlebakery.littlebakery.dao;

import com.zorin.by.littlebakery.littlebakery.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
    boolean existsImageByFileName(String fileName);
    Image findByFileName(String fileName);
}
