package com.techelevator.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//show the user all vending machine options/items with remaining quantity (using the catering.csv)
public class Display {

    public String getDisplayScreen(){

        String path = "C:\\\\Users\\\\Student\\\\workspace\\\\module-1-capstone-group-3\\\\catering.csv";
        String path2 = "C:\\Users\\Student\\workspace\\module-1-capstone-group-3\\catering1.csv";
        //String pathFinal = ((path) || (path2));
        File catering = new File(path);
        File catering2 = new File(path2);


        Map<String, SelectItem> selectedItems = new HashMap<>();
        //TODO create item counter within SelectItem

        try (Scanner scanner = new Scanner(catering)){
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

            }catch(FileNotFoundException e){
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

        }






