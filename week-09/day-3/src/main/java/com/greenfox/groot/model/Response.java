package com.greenfox.groot.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Response {
    public String received;
    public String translated = "I am Groot!";

    public Response(String received) {
        this.received = received;
    }
}
