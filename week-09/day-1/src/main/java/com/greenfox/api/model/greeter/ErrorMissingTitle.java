package com.greenfox.api.model.greeter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ErrorMissingTitle {
    private String error = "Please provide a title!";
}
