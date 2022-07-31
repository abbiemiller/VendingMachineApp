package com.techelevator.application;

import java.math.BigDecimal;

//name, price, extends select item; returns drinky, drinky, slurp, slurp;
public class Drink extends SelectItem {

    private String message = "Drinky, drinky, slurp, slurp!";

    public Drink(String name, BigDecimal price, String type, BigDecimal quantity) {
        super(name, price, type, quantity);

    }

    public String getMessage() {
        return message;
    }
}