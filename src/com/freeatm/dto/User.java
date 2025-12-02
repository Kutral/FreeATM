package com.freeatm.dto;

public class User {
    private final String name;
    private final String pin;
    private double balance;

    public User(String name, String pin) {
        this.name = name;
        this.pin = pin;
        this.balance = 0.0;
    }

    public String getPin() {
        return pin;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

