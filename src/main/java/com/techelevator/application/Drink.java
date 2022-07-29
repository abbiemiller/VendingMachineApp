package com.techelevator.application;

import java.math.BigDecimal;

//name, price, extends select item; returns drinky, drinky, slurp, slurp;
public class Drink extends SelectItem {

    private String message = "Drinky, drinky, slurp, slurp!";

    public Drink(String name, BigDecimal price, String type) {
        super(name, price, type);

    }

    public String getMessage() {
        return message;
    }
}