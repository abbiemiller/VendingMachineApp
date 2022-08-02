package com.techelevator.application;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class InventoryTest {

    @Test
    public void getFinishBalancetest() {


        //Arrange
        Inventory testInventory = new Inventory();


        //Act
        //String actualString = testInventory.getFinishBalance(BigDecimal.valueOf(1.00));

        //Assert
        String expected = "Here is your change: $5 dollars 2 quarters 1 dimes 1 nickles.";
       // assertEquals(expected,actualString);
    }
}