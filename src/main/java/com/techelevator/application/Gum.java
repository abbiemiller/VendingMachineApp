package com.techelevator.application;
// name, price, extends selectItem; return chewy, chewy, lots o bubbles!


import java.math.BigDecimal;

public class Gum extends SelectItem{
    private String message = "Chewy, Chewy, lots o bubbles";

    public Gum(String name, BigDecimal price) {
        super(name, price);
    }


        public String getMessage() {
            return message;
        }
    }



