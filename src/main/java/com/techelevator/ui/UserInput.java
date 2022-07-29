package com.techelevator.ui;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Responsibilities: This class should handle receiving ALL input from the User
 *
 * Dependencies: None
 */
public class UserInput {
    private Scanner scanner = new Scanner(System.in);

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
            return "display";
        } else if (option.equals("p")) {
            return "purchase";
        } else if (option.equals("e")) {
            return "exit";
        } else {
            return "";
        }


    }

    public String getPurchaseMenuOption() {
        System.out.println("What would you like to do?");
        System.out.println();

        System.out.println("M) Feed Money");
        System.out.println("I) Select Item");
        System.out.println("X) Finish");

        System.out.println();
        System.out.print("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toLowerCase();
        System.out.println("option = " + option);
        if (option.equals("m")) {
            return "feed money";
        } else if (option.equals("s")) {
            return "select item";
        } else if (option.equals("x")) {
            return "finish";
        } else {
            return "";
        }

    }

    public String FeedMoneyOption() {
        System.out.println("What amounts would you like to insert?");
        System.out.println();

        System.out.println("1) One-Dollar");
        System.out.println("5) Five-Dollars");
        System.out.println("10) Ten");
        System.out.println("20) Twenty");


        System.out.println();
        System.out.print("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toLowerCase();
        System.out.println("option = " + option);
        if (option.equals("1")) {
            return getBalance + 1;
        } else if (option.equals("5")) {
            return getBalance + 1;
        } else if (option.equals("10")) {
            return getBalance + 5;
        } else if (option.equals("20")) {
            return getBalance + 20;
        }
return null;
    }
}
