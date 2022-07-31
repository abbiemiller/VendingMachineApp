package com.techelevator.application;

import com.techelevator.ui.UserInput;

import javax.swing.text.html.parser.Parser;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.*;

//show the user all vending machine options/items with remaining quantity (using the catering.csv)
public class Display {
    MoneyBalance moneyBalance = new MoneyBalance();
    //    Map<String, SelectItem> selectedItems = new HashMap<>();
//    String savedInput = "";
//    Double selectedItemPrice = selectedItems.get(savedInput).getPrice();
//    String selectedItemName = selectedItems.get(savedInput).getName();
//    String selectedItemType = selectedItems.get(savedInput).getType();
    Map<String, SelectItem> selectedItems = new HashMap<>();

    public String getDisplayScreenReader() {

        String path = "C:\\\\Users\\\\Student\\\\workspace\\\\module-1-capstone-group-3\\\\catering.csv";
        String path2 = "C:\\Users\\Student\\workspace\\module-1-capstone-group-3\\catering1.csv";
        //String pathFinal = ((path) || (path2));
        File catering = new File(path);
        File catering2 = new File(path2);


        //TODO create item counter within SelectItem

        try (Scanner scanner = new Scanner(catering)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                //               System.out.println(line);

                String[] itemArray = line.split(",");
                String itemSlot = itemArray[0];
                String name = itemArray[1];
                String price = itemArray[2];
                BigDecimal bigDecimal = new BigDecimal(price);
                String type = itemArray[3];
//                List<String> itemArrayList = new ArrayList<>();
//                String quantity = "";
//                itemArrayList.add(0, itemSlot);
//                itemArrayList.add(1,name);
//                itemArrayList.add(2,price);
//                itemArrayList.add(3,type);
//                itemArrayList.add(4,quantity);
//                BigDecimal bigDecimalQuantity = new BigDecimal(quantity);
//                String [] newItemArray = Arrays.copyOf(itemArrayList.toArray(), itemArrayList.size(), String[].class);
                BigDecimal bigDecimalQuantity = new BigDecimal(6);
                SelectItem newItem = new SelectItem(name, bigDecimal, type, bigDecimalQuantity);

                selectedItems.put(itemSlot, newItem);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error in Display Screen");
        }

        String mapList = "";
        for (Map.Entry<String, SelectItem> nextEntry : selectedItems.entrySet()) {
            String nextItemKey = nextEntry.getKey();
            SelectItem nextItemValue = nextEntry.getValue();
            mapList += nextItemKey + ", " + nextItemValue.getName() + ", " + nextItemValue.getPrice() + ", " + nextItemValue.getType() + ", " + nextItemValue.getQuantity() + "\n";

        }
        System.out.println(mapList);
        return mapList;
    }

    public String getSelectedItemsMap() {
        for (Map.Entry<String, SelectItem> nextEntry : selectedItems.entrySet()) {
            String nextItemKey = nextEntry.getKey();
            SelectItem nextItemValue = nextEntry.getValue();
            String updatedMap = "";
            updatedMap += nextItemKey + nextItemValue.getName() + nextItemValue.getPrice() + nextItemValue.getType() + nextItemValue.getQuantity() + "\n";
            return updatedMap;

        }
        return null;
    }


        public String getFeedMoneyScreen () {
            double add1 = 1.0;
            double add5 = 5.0;
            double add10 = 10.0;
            double add20 = 20.0;


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
            //String intOption = String.valueOf(Integer.parseInt(option) * 100);
            if (option.equals("1")) {
                moneyBalance.moneyFed(add1);
                System.out.println("You selected to add $" + option + " to your current balance. Your new balance is $"
                        + moneyBalance.getBalance() + " Thank you.");
            } else if (option.equals("5")) {
                moneyBalance.moneyFed(add5);
                System.out.println("You selected to add $" + option + " to your current balance. Your new balance is $"
                        + moneyBalance.getBalance() + " Thank you.");
            } else if (option.equals("10")) {
                moneyBalance.moneyFed(add10);
                System.out.println("You selected to add $" + option + " to your current balance. Your new balance is $"
                        + moneyBalance.getBalance() + " Thank you.");
            } else if (option.equals("20")) {
                moneyBalance.moneyFed(add20);
                System.out.println("You selected to add $" + option + " to your current balance. Your new balance is $"
                        + moneyBalance.getBalance() + " Thank you.");
            }
            return "Your current balance is " + moneyBalance.getBalance();

        }


        public double getSelectionScreen () {

            System.out.println("=======Selection Screen========");

            String path = "C:\\\\Users\\\\Student\\\\workspace\\\\module-1-capstone-group-3\\\\catering.csv";
            String path2 = "C:\\Users\\Student\\workspace\\module-1-capstone-group-3\\catering1.csv";
            //String pathFinal = ((path) || (path2));
            File catering = new File(path);
            File catering2 = new File(path2);


            Map<String, SelectItem> selectedItems = new HashMap<>();
            //TODO create item counter within SelectItem

            BigDecimal bigDecimalQuantity = null;
            String type = null;
            BigDecimal bigDecimal = null;
            String name = null;
            try (Scanner scanner = new Scanner(catering)) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    System.out.println(line);

                    String[] itemArray = line.split(",");
                    String itemSlot = itemArray[0];
                    name = itemArray[1];
                    String price = itemArray[2];
                    bigDecimal = new BigDecimal(price);
                    type = itemArray[3];
                    // String quantity = itemArray[4];
                    //bigDecimalQuantity = new BigDecimal(quantity);
                    SelectItem newItem = new SelectItem(name, bigDecimal, type, bigDecimalQuantity);
                    selectedItems.put(itemSlot, newItem);
                }

            } catch (FileNotFoundException e) {
                System.out.println("Error in Display Screen");
            }

            String mapList = null;
            Double newBalance = 5.0;
            for (Map.Entry<String, SelectItem> nextEntry : selectedItems.entrySet()) {
                String nextItemKey = nextEntry.getKey();
                SelectItem nextItemValue = nextEntry.getValue();
                mapList = nextItemKey + nextItemValue;


                //String savedInput = "";
                //  Double selectedItemPrice = selectedItems.get(savedInput).getPrice();
                //  String selectedItemName = selectedItems.get(savedInput).getName();
                //  String selectedItemType = selectedItems.get(savedInput).getType();

            }
            System.out.println("=======Selection Time!!!!=======");
            System.out.println("Enter letter and number to dispense item!");
            Scanner userInput = new Scanner(System.in);
            String savedInput = userInput.nextLine();
            //variable name     //Map name     //key Value     //object method
            Double selectedItemPrice = selectedItems.get(savedInput).getPrice();
            BigDecimal bdQuantityLess1 = new BigDecimal(1);
            SelectItem newSelectedItemQuantity = new SelectItem(name, bigDecimal, type, bigDecimalQuantity.subtract(bdQuantityLess1));
            selectedItems.replace(savedInput, newSelectedItemQuantity);
            newBalance = moneyBalance.getBalance() - selectedItemPrice;
            System.out.println("Your item cost is " + selectedItemPrice + " your remaining balance is " + newBalance);

            return newBalance;
        }
    }












