package com.zorin.by.littlebakery.littlebakery.model;

import java.util.List;

public class MainPageDTO {
    private List<Slide> slides;
    private List<Post> posts;

    public List<Slide> getSlides() {
        return slides;
    }

    public void setSlides(List<Slide> slides) {
        this.slides = slides;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
