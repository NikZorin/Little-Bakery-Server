package com.zorin.by.littlebakery.littlebakery.service;

import com.zorin.by.littlebakery.littlebakery.model.Feedback;

import java.util.List;

public interface FeedbackService {
    List<Feedback> getFeedbacks();
    List<Feedback> getFeedbacks(int count);
    Feedback addFeedback(Feedback feedback);
    Feedback updateFeedback(Feedback feedback);
    Feedback removeFeedback(Feedback feedback);
}
