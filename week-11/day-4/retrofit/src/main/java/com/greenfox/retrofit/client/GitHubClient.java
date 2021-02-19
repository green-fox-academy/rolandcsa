package com.greenfox.retrofit.client;

import com.greenfox.retrofit.model.GitHubUser;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubClient {
    @GET("/users/{username}")
    Call<GitHubUser> getUser(@Path("username") String username);
}
