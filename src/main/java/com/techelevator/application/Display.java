package com.techelevator.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.*;

//show the user all vending machine options/items with remaining quantity (using the catering.csv)
public class Display {



    Map<String, SelectItem> selectedItems = new HashMap<>();
    Map<String, SelectItem> newMap = new HashMap<>();
    public Display(){
        this.newMap = selectedItems;
    }
    public Map<String, SelectItem> getDisplayScreenReader() {

        String path = "C:\\\\Users\\\\Student\\\\workspace\\\\module-1-capstone-group-3\\\\catering.csv";
        String path2 = "C:\\Users\\Student\\workspace\\module-1-capstone-group-3\\catering1.csv";
        //String pathFinal = ((path) || (path2));
        File catering = new File(path);
        File catering2 = new File(path2);


        //TODO create item counter within SelectItem

        try (Scanner scanner = new Scanner(catering)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] itemArray = line.split(",");
                String itemSlot = itemArray[0];
                String name = itemArray[1];
                String price = itemArray[2];
                BigDecimal bigDecimal = new BigDecimal(price);
                String type = itemArray[3];
                BigDecimal bigDecimalQuantity = new BigDecimal(6);
                SelectItem newItem = new SelectItem(name, bigDecimal, type, bigDecimalQuantity);

                selectedItems.put(itemSlot, newItem);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error in Display Screen");
        }
        return selectedItems;
    }

    public String getSelectedItemsMap() {
        String updatedMap = "";
        for (Map.Entry<String, SelectItem> nextEntry : selectedItems.entrySet()) {
            String nextItemKey = nextEntry.getKey();
            SelectItem nextItemValue = nextEntry.getValue();
            updatedMap += nextItemKey + ", " + nextItemValue.getName() + ", " + nextItemValue.getPrice() + ", " + nextItemValue.getType() + ", " + nextItemValue.getQuantity() + "\n";


        }
        return updatedMap;
    }

    public Map<String, SelectItem> getNewMap() {
        return this.newMap;
    }


    }












