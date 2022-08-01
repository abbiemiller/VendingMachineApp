package com.techelevator.application;



import java.math.BigDecimal;

public class Candy extends SelectItem {

    private String message = "Sugar, sugar, so sweet!";

    public Candy(String name, BigDecimal price, String type, BigDecimal quantity) {
        super(name, price, type, quantity);
    }
        public String getMessage() {
            return message;
        }
    }
