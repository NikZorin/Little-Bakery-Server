package com.zorin.by.littlebakery.littlebakery.service;

import com.zorin.by.littlebakery.littlebakery.model.Slide;

import java.util.List;

public interface SlideService {
    List<Slide> getSlides();
    Slide addSlide(Slide slide);
    Slide updateSlide(Slide slide);
    Slide removeSlide(Slide slide);
}
