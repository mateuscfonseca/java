package com.mateus.rest.dto;

import com.mateus.modelos.BlogPost;

public class BlogPostDTO {
    
    public Long id;

    public String title;

    public String body;
    
    public BlogPostDTO() {}
    public BlogPostDTO(BlogPost post) {
	this.id = post.getId();
	this.title = post.getTitle();
	this.body = post.getBody();
    }

}
