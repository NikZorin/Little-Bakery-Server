package com.zorin.by.littlebakery.littlebakery.service;

import com.zorin.by.littlebakery.littlebakery.dao.SlideRepository;
import com.zorin.by.littlebakery.littlebakery.model.Slide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SlideServiceImpl implements SlideService {
    @Autowired
    private SlideRepository slideRepository;

    @Override
    public List<Slide> getSlides() {
        return slideRepository.findAllByOrderByIdDesc();
    }

    @Override
    public Slide addSlide(Slide slide) {
        return slideRepository.save(slide);
    }

    @Override
    public Slide updateSlide(Slide slide) {
        return slideRepository.save(slide);
    }

    @Override
    public Slide removeSlide(Slide slide) {
        slideRepository.delete(slide);
        return slide;
    }
}
