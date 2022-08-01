package com.techelevator.application;



import java.math.BigDecimal;

public class Gum extends SelectItem{
    private String message = "Chewy, Chewy, lots o bubbles";

    public Gum(String name, BigDecimal price, String type, BigDecimal quantity) {
        super(name, price, type, quantity);
    }


        public String getMessage() {
            return message;
        }
    }



