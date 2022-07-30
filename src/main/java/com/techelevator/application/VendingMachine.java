package com.techelevator.application;

import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import java.io.FileNotFoundException;

public class VendingMachine{
    UserInput userInput = new UserInput();
    UserOutput userOutput = new UserOutput();

    public void run() {
        while(true) {
            userOutput.displayHomeScreen();
            String choice = userInput.getHomeScreenOption();

            System.out.println(choice);
            if(choice.equals("display")) {
               Display display = new Display();
                display.getDisplayScreen();




                // display the items
            }
            else if(choice.equals("purchase")) {
                // make a purchase
            userInput.getPurchaseMenuOption();


            }
            else if(choice.equals("exit")) {
                // good bye
                break;
            }
        }

    }
}
