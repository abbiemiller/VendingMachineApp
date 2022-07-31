package com.techelevator.application;

import java.math.BigDecimal;

//shows name, price, extends select item; return munchy, munchy, so good!
public class Munchies extends SelectItem {

    private String message = "Munchy, munchy, so good!";

    public Munchies(String name, BigDecimal price, String type, BigDecimal quantity) {
        super(name, price, type,quantity);
    }
    public String getMessage() {
        return message;
    }
}
