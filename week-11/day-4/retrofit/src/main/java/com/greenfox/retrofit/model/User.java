package com.greenfox.retrofit.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class User {
    private String login;
    private Long id;
    private String url;
}
