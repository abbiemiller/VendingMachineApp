package com.techelevator.application;

//generate stamp with info: 01/01/2022 12:00:15 PM MONEY FED:          $5.00  $10.00
//Sytem.out.printf(“%-30s %s%n”, "Delivery Method", “$ cost”);
//for(Delivery Driver deliveries: deliveryMethod({ System.out.printf(“%-30s $%.2f%n”, deliveries, deliveries.calculateRate(distance, weight));
//May use this for the Sales Report

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AuditReport {

    public LocalDateTime timeOfTransaction = LocalDateTime.now();


    public void updateLogSelectedItems(String name, String type, SelectItem userInput, BigDecimal CurrentBalance, BigDecimal RemainingBalance){
        File file = new File("Audit.txt");
        try {
            FileOutputStream audit = new FileOutputStream(file, true);
            System.out.println();
            PrintWriter writer = new PrintWriter(audit);
            DateTimeFormatter myDateAndTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");
            String formattedDateAndTime = timeOfTransaction.now().format(myDateAndTimeFormatter);
            writer.printf(formattedDateAndTime + " " + ": " + name + " " +
                     type + " "  + userInput + " " + CurrentBalance + " " + RemainingBalance + "\n");
            writer.close();
        } catch (FileNotFoundException audit) {
            System.out.println("Log was not written, try again!");
        }
        System.out.println();
    }
    public void updateLogMoneyFed(String transactionType, BigDecimal moneyAddedOrSpent, BigDecimal totalAvailableFunds) {

        File file = new File("Audit.txt");
        try {
            FileOutputStream audit = new FileOutputStream(file, true);
            System.out.println();
            PrintWriter writer = new PrintWriter(audit);
            DateTimeFormatter myDateAndTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");
            String formattedDateAndTime = timeOfTransaction.now().format(myDateAndTimeFormatter);
            writer.printf(formattedDateAndTime + " " + ": " + transactionType + " " +
                            "$" + moneyAddedOrSpent + " " + "$" + totalAvailableFunds + "\n");
            writer.close();
        } catch (FileNotFoundException audit) {
            System.out.println("Log was not written, try again!");
        }
        System.out.println();

    }


    }






