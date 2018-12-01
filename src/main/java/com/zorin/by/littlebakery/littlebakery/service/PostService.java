package com.zorin.by.littlebakery.littlebakery.service;

import com.zorin.by.littlebakery.littlebakery.model.Post;

import java.util.List;

public interface PostService {
    List<Post> getPosts();
    List<Post> getPosts(int count);
    Post addPost(Post post);
    Post updatePost(Post post);
    Post removePost(Post post);
}
