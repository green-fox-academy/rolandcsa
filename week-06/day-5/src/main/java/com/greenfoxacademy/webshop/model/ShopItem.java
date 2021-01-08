package com.greenfoxacademy.webshop.model;

public class ShopItem {
    private final String name;
    private final String description;
    private final Double price;
    private final Integer quantity;

    public ShopItem(String name, String description, Double price, Integer quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
