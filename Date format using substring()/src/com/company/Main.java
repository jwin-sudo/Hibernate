package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util. *;
public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the date value");
        String enteredDate = br.readLine();
        StringBuilder sb = new StringBuilder();
        sb.append(enteredDate);

        if(!enteredDate.substring(2,3).equals("-") && !enteredDate.substring(5,6).equals("-")){
            sb.replace(2,3,"-");
            sb.replace(5,6,"-");
        }

        System.out.println("Date in correct format\n" + sb.toString());
    }
}
