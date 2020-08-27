package com.conduent.springbootonetomany.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class BlogPost {

    @Id
    @GeneratedValue
    private Integer pid;
    private String author;
    private String title;

//    While adding BlogPost we can set list of comments
    @OneToMany(targetEntity = Comments.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "pc_fk", referencedColumnName = "pid")

    private List<Comments> comments;

}
