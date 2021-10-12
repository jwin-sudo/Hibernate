package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang. *;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the email address");
        String email = br.readLine();

        String domain = email.substring(email.indexOf(".")+1);

        if(domain.equals("com")  || domain.equals("in") || domain.equals("net") || domain.equals("org")){
            System.out.println("Valid email address");
        }

        else{
            System.out.println("Invalid email address");
        }
        


    }
}
