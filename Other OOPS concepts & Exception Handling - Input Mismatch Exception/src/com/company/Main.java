package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.util. *;
public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter an integer input");
            Integer input =  sc.nextInt();

            System.out.println("Entered value is " + input);
        }

        catch(InputMismatchException e){
            System.out.println(e);
        }
    }
}
