package com.techelevator.ui;

import com.techelevator.application.Display;
import com.techelevator.application.Inventory;
import com.techelevator.application.MoneyBalance;
import com.techelevator.application.SelectItem;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Responsibilities: This class should handle receiving ALL input from the User
 *
 * Dependencies: None
 */
public class UserInput {
    MoneyBalance money = new MoneyBalance();
    Inventory userInventory = new Inventory();

    private Scanner scanner = new Scanner(System.in);
    Display display = new Display();

    public String getHomeScreenOption() {
        System.out.println("What would you like to do?");
        System.out.println();

        System.out.println("D) Display Items");
        System.out.println("P) Purchase");
        System.out.println("E) Exit");

        System.out.println();
        System.out.print("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toLowerCase();
        System.out.println("option = " + option);
        if (option.equals("d")) {
            return userInventory.getDisplay();
        } else if (option.equals("p")) {
            return "purchase";
        } else if (option.equals("e")) {
            getHomeScreenOption();
            return "exit";
        } else {
            return "Invalid Selection. Please try again.";
        }


    }

    public String getPurchaseMenuOption() {
        //need some kind of while loop
        System.out.println("What would you like to do?");
        System.out.println();

        System.out.println("M) Feed Money");
        System.out.println("I) Inventory Selection");
        System.out.println("X) Finish");
        System.out.println("Current Money Provided: $" + userInventory.balance);

        System.out.println();
        System.out.print("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toLowerCase();

        if (option.equals("m")) {
            userInventory.getFeedMoneyScreen();

        } else if (option.equals("i")) {
            userInventory.getSelectionScreen();
        }

        else if (option.equals("x")) {

            userInventory.getFinishBalance();
            getHomeScreenOption();
        }

        return null;
    }
}




