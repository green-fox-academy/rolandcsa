package com.greenfox.api.model.appenda;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AppendA {
    private String appended;

    public AppendA(String appendable) {
        this.appended = appendable + "a";
    }
}
