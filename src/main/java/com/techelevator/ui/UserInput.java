package com.techelevator.ui;

import com.techelevator.application.Display;
import com.techelevator.application.MoneyBalance;
import com.techelevator.application.SelectItem;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Responsibilities: This class should handle receiving ALL input from the User
 *
 * Dependencies: None
 */
public class UserInput {
    MoneyBalance money = new MoneyBalance();
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
        if (option.equals("m")) {
            display.getFeedMoneyScreen();

        } else if (option.equals("i")) {
            display.getSelectionScreen();

        } else if (option.equals("x")) {
            return "finish";
        } else {
            return "";
        }
//        Scanner userInput = new Scanner(System.in);
//        String savedInput = userInput.nextLine();
//        display.getSelectedItemPrice(savedInput);
        return null;

    }
}

//        public String userChoseSelect() {
//            System.out.println("Please enter letter and number of your choice!");
//            System.out.println();
//            String chooseItem = scanner.nextLine();
//            String option = chooseItem.trim().toLowerCase();
//            System.out.println("option = " + option);
//            if (option.equals("c")) {
//            }
//            return "display";
//
//



//    public int getFeedMoneyOption() {
//        System.out.println("What amounts would you like to insert?");
//        System.out.println();
//
//        System.out.println("1) One-Dollar");
//        System.out.println("5) Five-Dollars");
//        System.out.println("10) Ten");
//        System.out.println("20) Twenty");
//
//
//        System.out.println();
//        System.out.print("Please select an option: ");
//
//        String selectedOption = scanner.nextLine();
//        String option = selectedOption.trim().toLowerCase();
//        System.out.println("option = " + option);
//        if (option.equals("1")) {
//
//           return money.getBalance();
//        } else if (option.equals("5")) {
//          return money.getBalance();
//        } else if (option.equals("10")) {
//            return money.getBalance();
//        } else if (option.equals("20")) {
//            return money.getBalance();
//        }
//        return money.getBalance();
//    }
//}
