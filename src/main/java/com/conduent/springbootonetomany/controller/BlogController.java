package com.conduent.springbootonetomany.controller;

import com.conduent.springbootonetomany.dto.BlogRequest;
import com.conduent.springbootonetomany.dto.BlogResponse;
import com.conduent.springbootonetomany.entity.BlogPost;
import com.conduent.springbootonetomany.entity.Comments;
import com.conduent.springbootonetomany.repository.BlogPostRepository;
import com.conduent.springbootonetomany.repository.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlogController {

    @Autowired
    private BlogPostRepository blogPostRepository;

    @Autowired
    private CommentsRepository commentsRepository;

    @PostMapping("/writeBlog")
    public BlogPost writeBlog(@RequestBody BlogRequest blogRequest){
        return blogPostRepository.save(blogRequest.getBlogPost());
    }

    @GetMapping("/readBlog")
    public List<BlogPost> readBlog(){
        return blogPostRepository.findAll();
    }

    @GetMapping("/getInfo")
    public List<BlogResponse> getJoinInformation(){
        return blogPostRepository.getJoinInformation();
    }

}
