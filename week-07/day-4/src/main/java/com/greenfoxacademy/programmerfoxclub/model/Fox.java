package com.greenfoxacademy.programmerfoxclub.model;

import java.util.List;

public class Fox {
    private String name = "Mr. Fox";
    private String food = "pizza";
    private String drink = "lemonade";
    private Integer trickCount = 0;
    private List<String> tricks;

    public Fox(String name) {
        this.name = name;
    }

    public Fox(String name, String food, String drink, Integer trickCount) {
        this.name = name;
        this.food = food;
        this.drink = drink;
        this.trickCount = trickCount;
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }

    public Integer getTrickCount() {
        return trickCount;
    }

    public List<String> getTricks() {
        return tricks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setTrickCount(Integer trickCount) {
        this.trickCount = trickCount;
    }

    public void setTricks(List<String> tricks) {
        this.tricks = tricks;
    }
}
