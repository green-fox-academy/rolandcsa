package com.greenfox.retrofit;

import com.greenfox.retrofit.client.GitHubClient;
import com.greenfox.retrofit.model.User;
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

    public User getUser(String username) throws IOException {
        GitHubClient gitHubClient = retrofit.create(GitHubClient.class);
        Call<User> callSync = gitHubClient.getUser(username);
        Response<User> response = callSync.execute();
        return response.body();
    }
}