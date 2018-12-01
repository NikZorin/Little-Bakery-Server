package com.zorin.by.littlebakery.littlebakery.controller;

import com.zorin.by.littlebakery.littlebakery.model.Slide;
import com.zorin.by.littlebakery.littlebakery.service.SlideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SlideController {
    @Autowired
    SlideService slideService;

    @GetMapping("/slides")
    public List<Slide> getSlides() {
        return slideService.getSlides();
    }

    @GetMapping("/private/slides")
    public List<Slide> getSlidesPrivate() {
        return slideService.getSlides();
    }

    @PostMapping("/slides")
    public Slide addSlide(@RequestBody Slide slide) {
        return slideService.addSlide(slide);
    }

    @PutMapping("/slides")
    public Slide updateSlide(@RequestBody Slide slide) {
        return slideService.updateSlide(slide);
    }

    @DeleteMapping("/slides")
    public Slide removeSlide(@RequestBody Slide slide) {
        return slideService.removeSlide(slide);
    }
}
