package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util. *;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Item details");
        String input = br.readLine();

        StringTokenizer multiTokenizer = new StringTokenizer(input,",");

        System.out.format("%-15s %-15s %-15s\n", "Number", "Item Type", "Vendor");

        while(multiTokenizer.hasMoreTokens()){

            System.out.printf("%-15s", multiTokenizer.nextToken());
        }



    }
}
