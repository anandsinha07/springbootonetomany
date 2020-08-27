package com.conduent.springbootonetomany.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Comments {

    @Id
    private Integer cid;
    private String userName;
    private String data;
}
