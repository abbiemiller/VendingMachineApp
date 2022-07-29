package com.techelevator.application;
//subclass of SelectItem and also shows name of item, price; returns sugar, sugar, so sweet!


import java.math.BigDecimal;

public class Candy extends SelectItem {

    private String message = "Sugar, sugar, so sweet!";

    public Candy(String name, BigDecimal price, String type) {
        super(name, price, type);
    }
        public String getMessage() {
            return message;
        }
    }
