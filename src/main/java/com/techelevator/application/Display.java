package com.techelevator.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//show the user all vending machine options/items with remaining quantity (using the catering.csv)
public class Display {

//    String cateringCsv= "C:\\Users\\Student\\workspace\\module-1-capstone-group-3\\catering.csv";

//    Scanner scanner= new Scanner(System.in);
//
//    Scanner machineItems= new Scanner(cateringCsv);
//    while(machineItems.hasNextLine()){
//        String displayItemLine=machineItems.nextLine();
//        displayItemLine.toCharArray();
//        displayItemLine.println();


    //    File inputFile = new File("catering.csv");
//System.out.println(inputFile.getAbsolutePath());
//System.out.println("This file has: " + catering.length());


    public Display() throws FileNotFoundException {

        String path = "C:\\\\Users\\\\Student\\\\workspace\\\\module-1-capstone-group-3\\\\catering.csv";
        File catering = new File(path);
        Scanner scanner = new Scanner(catering);

        Map<String, SelectItem> selectedItems = new HashMap<>();





            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);

                String[] itemArray = line.split( "," );
                String itemSlot = itemArray [0];
                String name= itemArray [1];
                String price= itemArray [2];
                BigDecimal bigDecimal= new BigDecimal(price);
                String type= itemArray [3];
               SelectItem newItem= new SelectItem(name, bigDecimal, type);
                selectedItems.put(itemSlot, newItem);

//                for( Display: selectedItems.get[0]{
//
//                }


            }



    }}