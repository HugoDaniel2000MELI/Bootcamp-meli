package com.exercise1.poo_spring4.service;

import com.exercise1.poo_spring4.exception.DuplicateException;
import com.exercise1.poo_spring4.exception.NotFoundException;
import com.exercise1.poo_spring4.model.Blog;
import com.exercise1.poo_spring4.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Optional;

@Service
public class BlogService implements IBlogService{
    @Autowired
    private BlogRepository repository;

    @Override
    public Blog createPost(Blog post) {
        Optional<Blog> optionalBlog = repository.getPostById(post.getId());
        if(optionalBlog.isPresent()){
            throw new DuplicateException("Id: " + post.getId() + " already exist!");
        }
        return repository.createPost(post);
    }

    @Override
    public HashMap<Integer, Blog> getAllPosts() {
        Optional<HashMap<Integer, Blog >> optionalBlogHashMap = repository.getAllPost();
        if (optionalBlogHashMap.isEmpty()){
            return new HashMap<>();
        }
        return optionalBlogHashMap.get();
    }

    @Override
    public Blog getPostById(int id) {
        Optional<Blog> optionalBlog = repository.getPostById(id);
        if (optionalBlog.isEmpty()){
            throw new NotFoundException("Post not found");
        }
        return optionalBlog.get();
    }

}
