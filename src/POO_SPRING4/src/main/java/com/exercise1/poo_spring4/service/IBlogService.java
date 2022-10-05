package com.exercise1.poo_spring4.service;

import com.exercise1.poo_spring4.model.Blog;

import java.util.HashMap;

public interface IBlogService {
    Blog createPost(Blog post);
    HashMap<Integer, Blog> getAllPosts();
    Blog getPostById(int id);
}
