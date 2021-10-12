package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util. *;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Flight name : ");
        String flightName = br.readLine();

        System.out.println("Enter Ticket No : ");
        Integer ticketNumber = Integer.parseInt(br.readLine());

        System.out.println("Enter Flight Fare : ");
        Double flightFare = Double.parseDouble(br.readLine());

        System.out.println("Enter Travelling Class : ");
        String travellingClass = br.readLine();

        System.out.println("Enter Source : ");
        String source = br.readLine();

        System.out.println("Enter Destination : ");
        String destination = br.readLine();
        System.out.println("Flight Details : ");

        System.out.println("Flight Name : " + flightName);
        System.out.println("Ticket No : "+ ticketNumber);
        System.out.format("Flight Fare : %.2f", flightFare );
        System.out.println("\nClass : " + travellingClass);
        System.out.println("Source : " + source);
        System.out.println("Destination : " + destination);
    }
}
