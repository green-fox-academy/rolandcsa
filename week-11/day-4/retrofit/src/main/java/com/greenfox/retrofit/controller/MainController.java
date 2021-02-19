package com.greenfox.retrofit.controller;

import com.greenfox.retrofit.MyRetrofit;
import com.greenfox.retrofit.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class MainController {

    @GetMapping("/githubuser")
    public ResponseEntity<User> getGitHubUser() throws IOException {
        return ResponseEntity.ok(new MyRetrofit().getUser("rolandcsa"));
    }
}
