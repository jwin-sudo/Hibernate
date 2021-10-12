package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util. *;
public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet noDupSet = new HashSet();
        String val = "";

        do {


            System.out.println("Enter the username");
            String userName = br.readLine();
            noDupSet.add(userName);

            System.out.println("Do you want to continue?(Y/N)");
            val = br.readLine();
        } while ((val.equals("Y") || val.equals("y")));

        System.out.println("The unique number of usernames is " + noDupSet.size());
    }
}

