package com.greenfox.reddit.controller;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.repository.PostRepository;
import com.greenfox.reddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {
    private final PostService postService;
    private final PostRepository postRepository;

    @Autowired
    public MainController(PostService postService, PostRepository postRepository) {
        this.postService = postService;
        this.postRepository = postRepository;
    }

    @GetMapping("/")
    public String index(Model model) {
        List<Post> postList = postService.getAllPosts();
        model.addAttribute("postList", postList);
        return "index";
    }
    @GetMapping("/newpost")
    public String getNewPost(){
        return "newpost";
    }
    @PostMapping("/newpost")
    public String postNewPost(@ModelAttribute Post post){
        postService.createNewPost(post.getTitle(), post.getUrl());
        return "redirect:/";
    }
    @PostMapping("/increaserating")
    @ResponseBody
    public String increaseRating(@ModelAttribute Post post){
        post.increaseRating(post);
        return "redirect:/";
    }
}
