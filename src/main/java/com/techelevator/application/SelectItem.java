package com.techelevator.application;
//holds MAP keys for purchased items; super class for purchaseable items
//make constructor for food types

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class SelectItem {
    public BigDecimal quantity = BigDecimal.valueOf(6.0);
    private String name;
    private BigDecimal price;
    public String type;



    public SelectItem(String name, BigDecimal price, String type, BigDecimal quantity) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.quantity = quantity;
    }

    public double getPrice()
    {return price.doubleValue();}

    public String getName() {

        return this.name;
    }
    public String getType(){

        return this.type;
        }
    public double getQuantity(){

        return quantity.doubleValue();
    }

}
