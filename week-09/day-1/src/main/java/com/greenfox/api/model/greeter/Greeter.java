package com.greenfox.api.model.greeter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Greeter {
    private String welcome_message;

    public Greeter(String name, String title) {
        this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
    }
}
