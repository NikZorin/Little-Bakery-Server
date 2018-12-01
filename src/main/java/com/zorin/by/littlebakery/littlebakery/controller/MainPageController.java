package com.zorin.by.littlebakery.littlebakery.controller;

import com.zorin.by.littlebakery.littlebakery.model.MainPageDTO;
import com.zorin.by.littlebakery.littlebakery.service.PostService;
import com.zorin.by.littlebakery.littlebakery.service.SlideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPageController {

    @Autowired
    private SlideService slideService;
    @Autowired
    private PostService postService;

    @GetMapping("/main/resources")
    public MainPageDTO getMainPageResources() {
        MainPageDTO dto = new MainPageDTO();
        dto.setSlides(slideService.getSlides());
        dto.setPosts(postService.getPosts());
        return dto;
    }
}
