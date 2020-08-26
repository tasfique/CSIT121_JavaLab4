package labtask4;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.stream.Collectors;


public class Main {

   
    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner (System.in);
        ArrayList<InventoryItem> InventoryItemList = new ArrayList<>(); //creating an arrayList.
        
        System.out.println("Enter Serial Number ");
        int serialNum = read.nextInt();
        System.out.println("Enter Description ");
        String description = read.next();
        System.out.println("Enter Cost Price ");
        double costPrice = read.nextDouble();
        System.out.println("Enter Selling Price ");
        double sellingPrice =  read.nextDouble();
        System.out.println("Enter Quantity In Hand");
        int quantityInHand = read.nextInt();
        
        System.out.println("Enter the 2nd Serial Number ");
        int serialNum2 = read.nextInt();
        System.out.println("Enter the 2nd Description ");
        String description2 = read.next();
        System.out.println("Enter the 2nd Cost Price ");
        double costPrice2 = read.nextDouble();
        System.out.println("Enter the 2nd Selling Price ");
        double sellingPrice2 =  read.nextDouble();
        System.out.println("Enter the 2nd Quantity In Hand");
        int quantityInHand2 = read.nextInt();
        
        InventoryItem inventoryItemObj = new InventoryItem (); //first object to store the details
        
        inventoryItemObj.setSerialNum(serialNum); //setting the values to the object.
        inventoryItemObj.setDescription(description);
        inventoryItemObj.setCostPrice(costPrice);
        inventoryItemObj.setSellingPrice(sellingPrice);
        inventoryItemObj.setQuantityInHand(quantityInHand);
        
        InventoryItemList.add(inventoryItemObj); //the arraylist.
        
        InventoryItem inventoryItemObj2 = new InventoryItem (); //second object.
        
        inventoryItemObj2.setSerialNum(serialNum2);
        inventoryItemObj2.setDescription(description2);
        inventoryItemObj2.setCostPrice(costPrice2);
        inventoryItemObj2.setSellingPrice(sellingPrice2);
        inventoryItemObj2.setQuantityInHand(quantityInHand2);
        
        InventoryItemList.add(inventoryItemObj2);
        
        File file = new File ("Inventory.txt");
        PrintWriter pw = new PrintWriter (file);
        
        for (InventoryItem obj : InventoryItemList) {
            pw.write(obj.getSerialNum()+",");
            pw.write(obj.getDescription()+",");
            pw.write(obj.getCostPrice()+",");
            pw.write(obj.getSellingPrice()+",");
            pw.write(obj.getQuantityInHand()+"");
            
            pw.println();
        }
        
        pw.close(); //closing the file.
        
        ArrayList<InventoryItem> InventoryItemListRead = new ArrayList<>(); //another arraylist.
        Scanner readFile = new Scanner(file);
        
        String st;
        while(readFile.hasNext()) {
            
            st = readFile.nextLine();
            String[] word = st.split(",");
             
            InventoryItem inventoryItemObj3 = new InventoryItem(); 
             
            inventoryItemObj3.setSerialNum(Integer.parseInt(word[0])); //putting the value into the object.
            inventoryItemObj3.setDescription((word[1]));
            inventoryItemObj3.setCostPrice(Double.parseDouble(word[2]));
            inventoryItemObj3.setSellingPrice(Double.parseDouble(word[3]));
            inventoryItemObj3.setQuantityInHand(Integer.parseInt(word[4]));
            
            InventoryItemListRead.add(inventoryItemObj3); //putting objects into arraylist
             
             
            System.out.println(st + ","+inventoryItemObj3.getTotalRevenue()); //to display in tabular format
             
        }
            double total = 0;
            
            total = total + InventoryItemList.get(0).getTotalRevenue()+InventoryItemList.get(1).getTotalRevenue();
            
            System.out.println("Total Revenue for all the Items are " + total);
        
        
    }
    
}
