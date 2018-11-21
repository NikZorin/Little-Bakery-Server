package com.zorin.by.littlebakery.littlebakery.controller;

import com.zorin.by.littlebakery.littlebakery.dao.PostRepository;
import com.zorin.by.littlebakery.littlebakery.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepository postRepository;

    @GetMapping("/posts")
    public List<Post> getPosts() {
        List<Post> result = postRepository.findAll();
        Collections.reverse(result);
        return result;
    }

    @PostMapping("/posts")
    public Post addPost(@RequestBody Post post) {
        postRepository.save(post);
        return post;
    }

    @DeleteMapping("/posts")
    public Post removePost(@RequestBody Post post) {
        postRepository.delete(post);
        return post;
    }

}
