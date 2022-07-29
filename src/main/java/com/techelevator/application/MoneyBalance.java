package com.techelevator.application;

//calculate change for return value("Finish"), show current money balance, feed money(increase balance)
//look to polymorph exercise for balance clues
//coin denomination returns

import java.util.Scanner;

public class MoneyBalance{


    private String customer;
    private int balance;

    public MoneyBalance() {
        this.balance = balance;
        this.balance = 0;
    }

    public int getBalance() {

        return balance;
    }


    public int moneyFed(int moneyFed) {
        balance = balance + moneyFed;
        return balance;
    }

    public int getSnackCost(int snackCost) {
        balance = balance - snackCost;
        return balance;
    }

    public int transferTo(MoneyBalance destinationAccount, int snackCost) {
        int newBalance = this.getBalance() - snackCost;

        if (newBalance < 0) {
            return this.getBalance();
        } else {
            this.getSnackCost(snackCost);
            destinationAccount.moneyFed(snackCost);
        }
        return this.balance;
    }
}




