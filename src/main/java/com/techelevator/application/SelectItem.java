package com.techelevator.application;
//holds MAP keys for purchased items; super class for purchaseable items
//make constructor for food types

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class SelectItem {
    private String name;
    private BigDecimal price;
    public String type;
    public int quanity = 6;


    public SelectItem(String name, BigDecimal price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public double getPrice()
    {return price.doubleValue();}

    public String getName() {
        return name;
    }
        public String getType(){
        return type;
        }

}
