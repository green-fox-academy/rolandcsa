package com.greenfox.api.model.doubling;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Doubling {
    private Integer received;
    private Integer result;

    public Doubling(Integer input) {
        this.received = input;
        this.result = input * 2;
    }
}
