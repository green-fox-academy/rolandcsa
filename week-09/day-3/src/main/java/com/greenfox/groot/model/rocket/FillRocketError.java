package com.greenfox.groot.model.rocket;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FillRocketError {
    private String error = "Please provide the requested parameters.";
}
