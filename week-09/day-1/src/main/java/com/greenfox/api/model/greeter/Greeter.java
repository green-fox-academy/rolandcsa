package com.greenfox.api.model.greeter;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Greeter {
    @JsonProperty(value = "welcome_message")
    private String welcomeMessage;

    public Greeter(String name, String title) {
        this.welcomeMessage = "Oh, hi there " + name + ", my dear " + title + "!";
    }
}
