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

            }
            else if(choice.equals("purchase")) {

            userInput.getPurchaseMenuOption();

            }
            else if(choice.equals("exit")) {
                System.out.println("Have an excellent day");
                break;
            }
        }

    }
}
