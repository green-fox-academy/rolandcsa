package com.bankofsimba.demo.model;

public class BankAccount {
    private final String name;
    private final Double balance;
    private final String animalType;
    private final Boolean isKing;

    public BankAccount(String name, Double balance, String animalType, Boolean isKing) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing;
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

    public Boolean getIsKing() {
        return isKing;
    }

    public String getCurrency() {
        return "Zebra";
    }

    public String getBalanceFormatted() {
        return String.format("%.2f", balance);
    }
    public String getColor(){
        if (isKing){
            return "red";
        }
        return "black";
    }
}
