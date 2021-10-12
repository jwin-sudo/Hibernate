package com.company;

import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util. *;

class Main{
    public static void main(String[] args) throws Exception{

        //Fill your code

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the item type name");
        String itemType = br.readLine();

        System.out.println("Enter the cost per day");
        double costPerDay = Double.parseDouble(br.readLine());


        System.out.println("Enter the deposit");
        double deposit = Double.parseDouble(br.readLine());

        ItemType result  = new ItemType(itemType, costPerDay, deposit);
        result.display();

        //System.out.println("Item type details");
        //System.out.println("Name : " + result.name);
        //System.out.printf("CostPerDay : " + "%.2f", costPerDay);
        //System.out.printf("\nDeposit : " + "%.2f" + result.deposit);

    }
}


