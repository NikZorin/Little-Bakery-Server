package com.zorin.by.littlebakery.littlebakery.dao;

import com.zorin.by.littlebakery.littlebakery.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
