package com.conduent.springbootonetomany.repository;

import com.conduent.springbootonetomany.dto.BlogResponse;
import com.conduent.springbootonetomany.entity.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BlogPostRepository extends JpaRepository <BlogPost, Integer> {

    @Query("SELECT new com.conduent.springbootonetomany.dto.BlogResponse(p.title , c.data, c.userName) FROM BlogPost p JOIN p.comments c")
    public List<BlogResponse> getJoinInformation();
}
