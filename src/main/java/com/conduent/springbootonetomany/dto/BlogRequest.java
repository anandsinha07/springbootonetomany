package com.conduent.springbootonetomany.dto;

import com.conduent.springbootonetomany.entity.BlogPost;
import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
public class BlogRequest {
    private BlogPost blogPost;

}
