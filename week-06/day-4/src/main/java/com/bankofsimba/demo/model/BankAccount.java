package com.bankofsimba.demo.model;

import java.util.concurrent.atomic.AtomicLong;

public class BankAccount {
    private final String name;
    private final Double balance;
    private final String animalType;
    private final Long id;

    public BankAccount(String name, Double balance, String animalType) {
        AtomicLong counter = new AtomicLong();
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.id = counter.getAndIncrement();
    }

    public String getName() {
        return name;
    }

    public Double getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getCurrency() {
        return "Zebra";
    }

    public String getBalanceFormatted() {
        return String.format("%.2f", balance);
    }
}
