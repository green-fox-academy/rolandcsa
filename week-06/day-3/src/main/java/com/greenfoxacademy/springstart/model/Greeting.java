package com.greenfoxacademy.springstart.model;

public class Greeting {
    Long counter;
    String name;

    public Greeting(Long counter, String name) {
        this.counter = counter;
        this.name = name;
    }

    public Long getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }
}
