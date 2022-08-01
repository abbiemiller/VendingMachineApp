package com.techelevator.application;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Inventory {
    Map<String, SelectItem> inventoryMap = new HashMap<>();
    Display inventoryDisplay = new Display();
    MoneyBalance inventoryMoney = new MoneyBalance();
    AuditReport newReport = new AuditReport();
    public BigDecimal balance = BigDecimal.valueOf(0.0);

    public Inventory() {
        this.inventoryMap = inventoryDisplay.getDisplayScreenReader();

    }

    public String getDisplay() {

        return "The current inventory is: " + "\n" + inventoryDisplay.getSelectedItemsMap();
    }


    public BigDecimal getSelectionScreen() {


        System.out.println(inventoryDisplay.getSelectedItemsMap());

        //BigDecimal balance = getBalance();

        System.out.println("=======Selection Time!!!!=======");
        System.out.println("Enter letter and number to dispense item!");
        Scanner userInput = new Scanner(System.in);
        String savedInput = userInput.nextLine();
        BigDecimal price = BigDecimal.valueOf(inventoryMap.get(savedInput).getPrice());
        String name = inventoryMap.get(savedInput).getName();
        String type = inventoryMap.get(savedInput).getType();
//        if (!inventoryMap.containsKey(userInput)) {
//            System.out.println("Invalid Entry. Try Again.");
//            return balance;
//        }
        if (price.compareTo(getBalance()) > 0) {
            System.out.println("Insufficient Funds.");
            return balance;
        }
        BigDecimal newSelectedItemQt = inventoryMap.get(savedInput).getQuantity();
        if (newSelectedItemQt.equals(BigDecimal.ZERO)) {
            System.out.println("ITEM " + inventoryMap.get(savedInput).getName() + " is OUT OF STOCK");
            return balance;
        }
        BigDecimal bdQuantityLess1 = new BigDecimal(1);
        BigDecimal newSelectedItemQt2 = newSelectedItemQt.subtract(bdQuantityLess1);
        inventoryMap.replace(savedInput, new SelectItem(name, price, type, newSelectedItemQt2));
        balance = balance.subtract(price);
        if (inventoryMap.get(savedInput).getType().contains("Candy")){
            System.out.println("Sugar, sugar, so sweet!");
        } else if (inventoryMap.get(savedInput).getType().contains("Munchies")) {
            System.out.println("Munchy, munchy so good! ");
        } else if (inventoryMap.get(savedInput).getType().contains("Gum")) {
            System.out.println("Chewy, Chewy, lots o bubbles");
        } else if (inventoryMap.get(savedInput).getType().contains("Drink")) {
            System.out.println("Drinky, drinky, slurp, slurp!");
        }

        if (newSelectedItemQt2.equals(BigDecimal.ZERO)) {
            System.out.println("Item cost is " + price + " :remaining balance: "
                    + balance + " ITEM " + inventoryMap.get(savedInput).getName() + " is now OUT OF STOCK");
            newReport.updateLogSelectedItems(inventoryMap.get(savedInput).getName(), inventoryMap.get(savedInput).getType(),
                    inventoryMap.get(userInput), balance, balance.subtract(price));
        } else {
            System.out.println("Item cost is $" + price + " --remaining balance is $"
                    + balance + " --remaining item amount: " + inventoryMap.get(savedInput).getQuantity());
            newReport.updateLogSelectedItems(inventoryMap.get(savedInput).getName(), inventoryMap.get(savedInput).getType(),
                    inventoryMap.get(userInput), balance, balance.subtract(price));
        }
        newReport.updateLogSelectedItems(inventoryMap.get(savedInput).getName(), inventoryMap.get(savedInput).getType(),
                inventoryMap.get(userInput), balance, balance.subtract(price));
        return balance.subtract(price);

    }


    public BigDecimal getBalance() {

        return this.balance;
    }

    public void moneyFed(BigDecimal moneyFed) {
        this.balance = this.balance.add(moneyFed);

    }

    public String getFinishBalance() {
        int dollars = 0;
        int quarters = 0;
        int nickles = 0;
        int dimes = 0;
        BigDecimal change = balance;
        BigDecimal remainder1 = change.remainder(BigDecimal.valueOf(3));


        return "Here is your change: " + remainder1;
    }


    public String getFeedMoneyScreen() {
        BigDecimal add1 = BigDecimal.valueOf(1.00);
        BigDecimal add5 = BigDecimal.valueOf(5.00);
        BigDecimal add10 = BigDecimal.valueOf(10.00);
        BigDecimal add20 = BigDecimal.valueOf(20.00);


        Scanner scanner = new Scanner(System.in);
        System.out.println();
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

        if (option.equals("1")) {
            moneyFed(add1);
            newReport.updateLogMoneyFed("Money Fed", BigDecimal.valueOf(1), balance);
            System.out.println("You selected to add $" + option + " to your current balance. Your new balance is $"
                    + getBalance() + " Thank you.");
        } else if (option.equals("5")) {
            moneyFed(add5);
            newReport.updateLogMoneyFed("Money Fed", BigDecimal.valueOf(5), balance);
            System.out.println("You selected to add $" + option + " to your current balance. Your new balance is $"
                    + getBalance() + " Thank you.");
        } else if (option.equals("10")) {
            moneyFed(add10);
            newReport.updateLogMoneyFed("Money Fed", BigDecimal.valueOf(10), balance);
            System.out.println("You selected to add $" + option + " to your current balance. Your new balance is $"
                    + getBalance() + " Thank you.");
        } else if (option.equals("20")) {
            moneyFed(add20);
            newReport.updateLogMoneyFed("Money Fed", BigDecimal.valueOf(20), balance);
            System.out.println("You selected to add $" + option + " to your current balance. Your new balance is $"
                    + getBalance() + " Thank you.");
        } else
            System.out.println("Invalid Selection. Please Try again.");

        return "Your current balance is " + getBalance();

    }


}


