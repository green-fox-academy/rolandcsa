package com.greenfox.api.model.doubling;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ErrorDoubling {
    private final String error = "Please provide an input!";
}
