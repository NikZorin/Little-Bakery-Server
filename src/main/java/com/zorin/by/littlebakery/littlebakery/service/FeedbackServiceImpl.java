package com.zorin.by.littlebakery.littlebakery.service;

import com.zorin.by.littlebakery.littlebakery.dao.FeedbackRepository;
import com.zorin.by.littlebakery.littlebakery.model.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FeedbackServiceImpl implements FeedbackService {
    @Autowired
    private FeedbackRepository feedbackRepository;

    @Override
    public List<Feedback> getFeedbacks() {
        return feedbackRepository.getAllByOrderByIdDesc();
    }

    @Override
    public List<Feedback> getFeedbacks(int count) {
        return feedbackRepository.getAllByOrderByIdDesc()
                .stream()
                .limit(count)
                .collect(Collectors.toList());
    }

    @Override
    public Feedback addFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    @Override
    public Feedback updateFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    @Override
    public Feedback removeFeedback(Feedback feedback) {
        feedbackRepository.delete(feedback);
        return feedback;
    }
}
