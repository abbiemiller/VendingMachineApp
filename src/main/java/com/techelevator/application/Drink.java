package com.techelevator.application;

import java.math.BigDecimal;


public class Drink extends SelectItem {

    private String message = "Drinky, drinky, slurp, slurp!";

    public Drink(String name, BigDecimal price, String type, BigDecimal quantity) {
        super(name, price, type, quantity);

    }

    public String getMessage() {
        return message;
    }
}