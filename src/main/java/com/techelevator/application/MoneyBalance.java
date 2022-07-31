package com.techelevator.application;

//calculate change for return value("Finish"), show current money balance, feed money(increase balance)
//look to polymorph exercise for balance clues
//coin denomination returns

import java.util.Scanner;

public class MoneyBalance{


    private String customer;
    private double balance = 0.0;

 //This is our main balance
    public double getBalance() {

        return this.balance;
    }


    public void moneyFed(double moneyFed) {
        this.balance = this.balance + moneyFed;

    }

    public double getSnackCost(double snackCost) {
        balance = balance - snackCost;
        return balance;
    }

    public double transferTo(MoneyBalance destinationAccount, double snackCost) {
        double newBalance = this.getBalance() - snackCost;

        if (newBalance < 0) {
            return this.getBalance();
        } else {
            this.getSnackCost(snackCost);
            destinationAccount.moneyFed(snackCost);
        }
        return this.balance;
    }
}




