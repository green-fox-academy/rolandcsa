package com.greenfox.api.model.greeter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ErrorMissingNameAndTitle {
    public String error = "Please provide a name and a title!";
}