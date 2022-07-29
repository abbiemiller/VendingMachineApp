package com.techelevator.application;

import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import java.io.FileNotFoundException;

public class VendingMachine extends Display{
    UserInput userInput = new UserInput();
    UserOutput userOutput = new UserOutput();

    public String run() {
        while(true) {
            userOutput.displayHomeScreen();
            String choice = userInput.getHomeScreenOption();

            System.out.println(choice);
            if(choice.equals("display")) {
                try {
                    return getDisplayScreen();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

                // display the items
            }
            else if(choice.equals("purchase")) {
                // make a purchase
            }
            else if(choice.equals("exit")) {
                // good bye
                break;
            }
        }
        return null;
    }
}
