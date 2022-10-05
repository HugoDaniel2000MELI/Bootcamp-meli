package com.exercise1.poo_spring4.repository;

import com.exercise1.poo_spring4.model.Blog;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

import java.util.Optional;

@Repository
public class BlogRepository {
    HashMap<Integer, Blog> blogsHashMap = new HashMap<>();

    public Blog createPost(Blog post){
        blogsHashMap.put(post.getId(), post);
        return blogsHashMap.get(post.getId());
    }

    public Optional<HashMap<Integer,Blog>>getAllPost(){
        if (blogsHashMap.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(blogsHashMap);
    }

    public  Optional<Blog>getPostById(int id){
        if(!blogsHashMap.containsKey(id)){
            return Optional.empty();
        }
        return Optional.of(blogsHashMap.get(id));
    }
}
