package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util. *;
import java.lang. *;
import java.io. *;
public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.println("Enter the cost of the item for n days");
            int cost = Integer.parseInt(br.readLine());

            System.out.println("Enter the value of n");
            int n = Integer.parseInt(br.readLine());

            int result = cost/n;

            System.out.println("Cost per day of the item is " + result);
        }

        catch(java.lang.ArithmeticException exc){
            System.out.println(exc);
        }

    }
}
