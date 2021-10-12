package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util. *;
public class Main {

    public static void main(String[] args) throws IOException, ParseException {
	// write your code here
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the details of the item type");
        System.out.println("Name:");
        String name = br.readLine();

        System.out.println("Deposit:");
        String deposit = br.readLine();

        System.out.println("Cost per Day:");
        String costPerDay = br.readLine();

        System.out.println("Enter the starting date:");
        String startingDate = br.readLine();
        Date starting = formatter.parse(startingDate);

        System.out.println("Enter the ending date:");
        String endingDate = br.readLine();
        Date ending = formatter.parse(endingDate);
        ItemType obj = new ItemType(name,Double.parseDouble(deposit), Double.parseDouble(costPerDay));

        ItemTypeBO obj2 = new ItemTypeBO();


        System.out.println("The total cost is Rs." + obj2.calculateCost(starting, ending, obj));
    }
}
