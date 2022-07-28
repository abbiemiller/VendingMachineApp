package com.techelevator.application;
//holds MAP keys for purchased items; super class for purchaseable items
//make constructor for food types

import java.math.BigDecimal;

public class SelectItem {
    private String name;
    private BigDecimal price;

    public SelectItem(String name, BigDecimal price) {
        this.name = name;
        this.price = price;

    }
}
