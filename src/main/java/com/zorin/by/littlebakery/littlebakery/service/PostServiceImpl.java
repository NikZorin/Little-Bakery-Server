package com.zorin.by.littlebakery.littlebakery.service;

import com.zorin.by.littlebakery.littlebakery.dao.PostRepository;
import com.zorin.by.littlebakery.littlebakery.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> getPosts() {
        return postRepository.findAllByOrderByIdDesc();
    }

    @Override
    public List<Post> getPosts(int count) {
        return postRepository.findAllByOrderByIdDesc()
                .stream()
                .limit(count)
                .collect(Collectors.toList());
    }

    @Override
    public Post addPost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Post updatePost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Post removePost(Post post) {
        postRepository.delete(post);
        return post;
    }
}
