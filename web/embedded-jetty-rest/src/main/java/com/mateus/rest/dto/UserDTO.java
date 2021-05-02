package com.mateus.rest.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.mateus.modelos.User;

public class UserDTO {

    public Long id;

    public String login;

    public Boolean disabled;

    public List<BlogPostDTO> blogPosts = new ArrayList<>();
    
    public UserDTO() {}
    public UserDTO(User user)  {
	this.id = user.getId();
	this.login = user.getLogin();
	this.disabled = user.getDisabled();
	this.blogPosts = user.getBlogPosts().stream().map(BlogPostDTO::new).collect(Collectors.toList());
    }

}
