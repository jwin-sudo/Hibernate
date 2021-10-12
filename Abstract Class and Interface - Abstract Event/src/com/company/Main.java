package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util. *;
public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your choice\n1.Exhibition\n2.StageEvent");
        int input = Integer.parseInt(br.readLine());


        if (input == 1){
            System.out.println("Enter the details in CSV format");
            String details = br.readLine();

            String[] detailsToStr = details.split(",");
            Exhibition exhibition = new Exhibition(detailsToStr[0], detailsToStr[1], detailsToStr[2], detailsToStr[3], Integer.parseInt(detailsToStr[4]), Double.parseDouble(detailsToStr[5]));

            System.out.println("Exhibition Details");
            System.out.println("Event Name:" + detailsToStr[0]);
            System.out.println("Detail:" + detailsToStr[1]);
            System.out.println("Type:" + detailsToStr[2]);
            System.out.println("Organiser Name:" + detailsToStr[3]);
            System.out.println("Total Cost:" + exhibition.calculateAmount());
        }

        else if(input == 2){
            System.out.println("Enter the details in CSV format");
            String details = br.readLine();

            String[] detailsToStr = details.split(",");
            StageEvent stageEvent = new StageEvent(detailsToStr[0], detailsToStr[1], detailsToStr[2], detailsToStr[3], Integer.parseInt(detailsToStr[4]), Double.parseDouble(detailsToStr[5]));

            System.out.println("Stage Event Details");
            System.out.println("Event Name:" + detailsToStr[0]);
            System.out.println("Detail:" + detailsToStr[1]);
            System.out.println("Type:" + detailsToStr[2]);
            System.out.println("Organiser Name:" + detailsToStr[3]);
            System.out.println("Total Cost:" + stageEvent.calculateAmount());
        }

        else{
            System.out.println("Invalid choice");
        }

    }
}
