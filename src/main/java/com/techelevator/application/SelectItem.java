package com.techelevator.application;
//holds MAP keys for purchased items; super class for purchaseable items
//make constructor for food types

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class SelectItem {
    private  String name;
    private  BigDecimal price;
    public String type;

    public SelectItem(String name, BigDecimal price, String type) {
        this.name = name;
        this.price = price;
        this.type=type;
    }

    public double getPrice() {
        return price.doubleValue();
    }

    //    Map<String, String> vendingMachineItems = new HashMap<String, String>();
//    vendingMachineItems.put(("A1", "U-Chews"));
//    vendingMachineItems.put("A2", "Ginger Ayle");

}

