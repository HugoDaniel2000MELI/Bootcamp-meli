package com.exercise1.poo_spring4.controller;

import com.exercise1.poo_spring4.model.Blog;
import com.exercise1.poo_spring4.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogService service;

    @PostMapping
    public ResponseEntity<Blog> createPost(@RequestBody Blog post){
        return new ResponseEntity<>(service.createPost(post), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<HashMap<Integer, Blog>> getAllPosts(){
        return new ResponseEntity<>(service.getAllPosts(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Blog> getPostById(@PathVariable int id){
        return new ResponseEntity<>(service.getPostById(id), HttpStatus.OK);
    }
}
