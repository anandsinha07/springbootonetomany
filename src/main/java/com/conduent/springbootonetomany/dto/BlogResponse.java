package com.conduent.springbootonetomany.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BlogResponse {

    private String title;
    private String data;
    private String userName;

    public BlogResponse (String title, String data, String userName){
        this.title = title;
        this.data = data;
        this.userName = userName;

    }

}
