package com.greenfox.groot;

import com.greenfox.groot.model.rocket.Rocket;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GrootApplication {
    private Rocket rocket;

    public static void main(String[] args) {
        SpringApplication.run(GrootApplication.class, args);
    }
}
