package com.greenfox.retrofit.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GitHubRepo {
    private Long id;
    private String name;
    @SerializedName("private")
    @JsonProperty("private")
    private Boolean isPrivate;
}
