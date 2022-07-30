package com.techelevator.application;

import com.techelevator.ui.UserInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//show the user all vending machine options/items with remaining quantity (using the catering.csv)
public class Display {
    MoneyBalance moneyBalance = new MoneyBalance();
//    Map<String, SelectItem> selectedItems = new HashMap<>();
//    String savedInput = "";
//    Double selectedItemPrice = selectedItems.get(savedInput).getPrice();
//    String selectedItemName = selectedItems.get(savedInput).getName();
//    String selectedItemType = selectedItems.get(savedInput).getType();

    public String getDisplayScreen() {

        String path = "C:\\\\Users\\\\Student\\\\workspace\\\\module-1-capstone-group-3\\\\catering.csv";
        String path2 = "C:\\Users\\Student\\workspace\\module-1-capstone-group-3\\catering1.csv";
        //String pathFinal = ((path) || (path2));
        File catering = new File(path);
        File catering2 = new File(path2);


        Map<String, SelectItem> selectedItems = new HashMap<>();
        //TODO create item counter within SelectItem

        try (Scanner scanner = new Scanner(catering)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);

                String[] itemArray = line.split(",");
                String itemSlot = itemArray[0];
                String name = itemArray[1];
                String price = itemArray[2];
                BigDecimal bigDecimal = new BigDecimal(price);
                String type = itemArray[3];
                SelectItem newItem = new SelectItem(name, bigDecimal, type);
                selectedItems.put(itemSlot, newItem);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error in Display Screen");
        }

        String mapList = null;
        for (Map.Entry<String, SelectItem> nextEntry : selectedItems.entrySet()) {
            String nextItemKey = nextEntry.getKey();
            SelectItem nextItemValue = nextEntry.getValue();
            mapList = nextItemKey + nextItemValue;


        }
        return mapList;


    }

    public double getSelectionScreen() {

        System.out.println("=======Selection Screen========");

        String path = "C:\\\\Users\\\\Student\\\\workspace\\\\module-1-capstone-group-3\\\\catering.csv";
        String path2 = "C:\\Users\\Student\\workspace\\module-1-capstone-group-3\\catering1.csv";
        //String pathFinal = ((path) || (path2));
        File catering = new File(path);
        File catering2 = new File(path2);


        Map<String, SelectItem> selectedItems = new HashMap<>();
        //TODO create item counter within SelectItem

        try (Scanner scanner = new Scanner(catering)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);

                String[] itemArray = line.split(",");
                String itemSlot = itemArray[0];
                String name = itemArray[1];
                String price = itemArray[2];
                BigDecimal bigDecimal = new BigDecimal(price);
                String type = itemArray[3];
                SelectItem newItem = new SelectItem(name, bigDecimal, type);
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
        newBalance = moneyBalance.getBalance() - selectedItemPrice;
        System.out.println("Your item cost is " + selectedItemPrice + " your remaining balance is " + newBalance);
        return newBalance;
    }
//            public void double getSelectedItemPrice (){
//
//            }
//
//            public String getSelectedItemName () {
//                return selectedItemName;
//            }
//
//            public String getSelectedItemType () {
//                return selectedItemType;
//            }
        }









