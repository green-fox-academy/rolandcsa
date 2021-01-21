package com.greenfox.reddit.controller;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class MainController {
    private final PostService postService;

    @Autowired
    public MainController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("postList", postService.trendingPosts());
        return "index";
    }

    @GetMapping("/newpost")
    public String getNewPost() {
        return "newpost";
    }

    @PostMapping("/newpost")
    public String postNewPost(@ModelAttribute Post post) {
        postService.createNewPost(post.getTitle(), post.getUrl());
        return "redirect:/";
    }

    @GetMapping("/upvote/{id}")
    public String upvote(@PathVariable Long id) {
        Optional<Post> optionalPost = postService.findById(id);
        if (optionalPost.isPresent()) {
            postService.upvote(optionalPost);
        }
        return "redirect:/";
    }

    @GetMapping("/downvote/{id}")
    public String downvote(@PathVariable Long id) {
        Optional<Post> optionalPost = postService.findById(id);
        if (optionalPost.isPresent()) {
            postService.downvote(optionalPost);
        }
        return "redirect:/";
    }
}
