package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util. *;
public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the name of the event:");
        String nameOfEvent = br.readLine();

        System.out.println("Enter the detail of the event:");
        String detailOfEvent = br.readLine();

        System.out.println("Enter the owner name of the event:");
        String ownerName = br.readLine();

        System.out.println("Enter the type of the event:\n1.Exhibition\n2.StageEvent");
        int typeOfEvent = Integer.parseInt(br.readLine());

        if(typeOfEvent == 1) {
            System.out.println("Enter the number of stalls:");
            int numberOfStalls = Integer.parseInt(br.readLine());
            Exhibition arr = new Exhibition(nameOfEvent, detailOfEvent, ownerName, numberOfStalls);
            System.out.println("The projected revenue of the event is " + arr.projectedRevenue());
        }
        else if(typeOfEvent == 2){

                System.out.println("Enter the number of shows:");
                int numberOfShows = Integer.parseInt(br.readLine());

                System.out.println("Enter the number of seats per show:");
                int numberOfSeats = Integer.parseInt(br.readLine());
                StageEvent arr2 = new StageEvent(nameOfEvent,detailOfEvent,ownerName,numberOfShows,numberOfSeats);
                System.out.println("The projected revenue of the event is " + arr2.projectedRevenue());
        }
    }
}
