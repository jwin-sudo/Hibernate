package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util. *;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {


            System.out.println("Enter the Item type details:");
            System.out.println("Enter the name:");
            String name = br.readLine();

            System.out.println("Enter the deposit:");
            double deposit = Double.parseDouble(br.readLine());

            System.out.println("Enter the cost per day:");
            double costPerDay = Double.parseDouble(br.readLine());

            ItemType itemType = new ItemType(name, deposit, costPerDay);
            System.out.println(itemType.toString());
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}
