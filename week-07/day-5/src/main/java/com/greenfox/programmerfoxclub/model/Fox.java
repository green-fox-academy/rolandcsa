package com.greenfox.programmerfoxclub.model;

import java.util.ArrayList;
import java.util.List;

public class Fox {
    private String name = "Mr. Fox";
    private String food = "pizza";
    private String drink = "lemonade";
    private List<String> tricks = new ArrayList<>();

    public Fox() {
    }

    public Fox(String name, String food, String drink) {
        this.name = name;
        this.food = food;
        this.drink = drink;
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

    public void setTricks(List<String> tricks) {
        this.tricks = tricks;
    }
}
