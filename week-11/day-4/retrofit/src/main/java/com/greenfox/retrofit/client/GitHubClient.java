package com.greenfox.retrofit.client;

import com.greenfox.retrofit.model.GitHubRepo;
import com.greenfox.retrofit.model.GitHubUser;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface GitHubClient {
    @GET("/users/{username}")
    Call<GitHubUser> getUser(@Path("username") String username);

    @GET("/users/{username}/repos")
    Call<List<GitHubRepo>> getUserRepos(@Path("username") String username);
}
