package com.greenfox.groot.model.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ResponseError {
    private String error = "I am Groot!";
}
