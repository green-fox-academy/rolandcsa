package com.greenfox.retrofit.model;

import com.greenfox.retrofit.client.GitHubClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

public class MyRetrofit {
    private static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public GitHubUser getUser(String username) throws IOException {
        GitHubClient gitHubClient = retrofit.create(GitHubClient.class);
        Call<GitHubUser> call = gitHubClient.getUser(username);
        Response<GitHubUser> response = call.execute();
        return response.body();
    }

    public List<GitHubRepo> getUserRepos(String username) throws IOException {
        GitHubClient gitHubClient = retrofit.create(GitHubClient.class);
        Call<List<GitHubRepo>> call = gitHubClient.getUserRepos(username);
        Response<List<GitHubRepo>> response = call.execute();
        return response.body();
    }
}