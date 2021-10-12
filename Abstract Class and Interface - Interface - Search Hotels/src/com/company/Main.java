package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util. *;
public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Choose the guide\n1.Make My Trip\n2.Trivago\n3.clear Trip");
        int num = Integer.parseInt(br.readLine());

        if (num ==1){
            System.out.println("Cities:");
            String city1 = br.readLine();
            String city2 = br.readLine();
            String city3 = br.readLine();

            System.out.println("Enter city where you want to search for hotels:");
            String citySearch = br.readLine();
        }

    }
}
