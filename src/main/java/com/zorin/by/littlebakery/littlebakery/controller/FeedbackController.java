package com.zorin.by.littlebakery.littlebakery.controller;

import com.zorin.by.littlebakery.littlebakery.model.Feedback;
import com.zorin.by.littlebakery.littlebakery.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeedbackController {
    @Autowired
    private FeedbackService feedbackService;

    @GetMapping("/feedbacks")
    public List<Feedback> getFeedbaks() {
        return feedbackService.getFeedbacks(5);
    }

    @GetMapping("/private/feedbacks")
    public List<Feedback> getFeedbacksPrivate() {
        return feedbackService.getFeedbacks();
    }

    @PostMapping("/feedbacks")
    public Feedback addFeedback(@RequestBody Feedback feedback) {
        return feedbackService.addFeedback(feedback);
    }

    @PutMapping("/feedbacks")
    public Feedback updateFeedback(@RequestBody Feedback feedback) {
        return feedbackService.updateFeedback(feedback);
    }

    @DeleteMapping("/feedbacks")
    public Feedback removeFeedback(@RequestBody Feedback feedback) {
        return feedbackService.removeFeedback(feedback);
    }
}
