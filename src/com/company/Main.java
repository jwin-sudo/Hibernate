package com.company;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        ArrayList<ItemType> arr = new ArrayList<ItemType>();

        int flag = 1;
        String loop;
        while(true){
            System.out.println("Enter the details of Item Type " + flag++);
            System.out.println("Name: ");
            String name = sc.nextLine();

            System.out.println("Deposit: ");
            Double deposit = sc.nextDouble();

            System.out.println("Cost per Day: ");
            Double costPerDay = sc.nextDouble();

            arr.add(new ItemType(name, deposit, costPerDay));

            System.out.println("Do you want to continue?(y/n)");
            loop = sc.nextLine();
            flag++;

        if(!loop.equals("y") || !loop.equals("Y"))
            break;
        }

        System.out.format("%-20s%-20s%-20s\n", "Name", "Deposit", "CostPerDay");
        for (ItemType i : arr) {
            System.out.println(i.toString());
        }
    }
}