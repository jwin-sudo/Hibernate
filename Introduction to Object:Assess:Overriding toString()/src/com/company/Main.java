package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util. *;
public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Address Line 1");
        String address1 = br.readLine();

        System.out.println("Enter Address Line 2");
        String address2 = br.readLine();

        System.out.println("Enter the City Name");
        String city = br.readLine();

        System.out.println("Enter the State Name");
        String state = br.readLine();

        System.out.println("Enter the Pincode");
        String pinCode = br.readLine();

        Address obj = new Address(address1,address2,city,state,Integer.parseInt(pinCode));

        System.out.println(obj.toString());

    }
}
