package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util. *;
public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        System.out.println("Enter Address Details :");
        System.out.println("Enter Line 1 :");
        String line1 = br.readLine();

        System.out.println("Enter Line 2 :");
        String line2 = br.readLine();

        System.out.println("Enter City :");
        String city = br.readLine();

        System.out.println("Enter Country :");
        String country = br.readLine();

        System.out.println("Enter Zip Code :");
        Integer zipCode = Integer.parseInt(br.readLine());

        Address addy = new Address(line1,line2,city,country,zipCode);



        sb.append(addy.toString());
        System.out.println(sb.toString());
    }
}
