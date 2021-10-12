package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util. *;

public class Main {

    public static void main(String[] args) throws IOException, WeakPasswordException {
	// write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {


            System.out.println("Enter the user details");
            String userDetails = br.readLine();

            String[] userDetailsToStr = userDetails.split(",");

            User user = new User(userDetailsToStr[0], userDetailsToStr[1], userDetailsToStr[2], userDetailsToStr[3]);


            UserBO obj = new UserBO();
            obj.validate(user);

            System.out.println("Name:" + userDetailsToStr[0]);
            System.out.println("Mobile:" + userDetailsToStr[1]);
            System.out.println("Username:" + userDetailsToStr[2]);
            System.out.println("Password:" + userDetailsToStr[3]);
        }
        catch(Exception e){
            System.out.println(e);
        }





    }
}
