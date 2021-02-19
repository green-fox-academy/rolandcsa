package com.greenfox.retrofit.model;

import com.greenfox.retrofit.client.GitHubClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class MyRetrofit {
    private static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public GitHubUser getUser(String username) throws IOException {
        GitHubClient gitHubClient = retrofit.create(GitHubClient.class);
        Call<GitHubUser> callSync = gitHubClient.getUser(username);
        Response<GitHubUser> response = callSync.execute();
        return response.body();
    }
}