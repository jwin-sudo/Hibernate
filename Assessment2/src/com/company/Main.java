package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException, ParseException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the detail of Hall 1");
        System.out.println("Name :");
        String hallOne = br.readLine();

        System.out.println("Contact Number : ");
        Long contactNum =Long.parseLong(br.readLine());

        System.out.println("Cost Per Day : ");
        Double costPerDay = Double.parseDouble(br.readLine());

        System.out.println("Owner Name : ");
        String ownerName = br.readLine();

        System.out.println("Booking Date(dd/mm/yyyy");
        String bookingDate = br.readLine();


        System.out.println("Enter the detail of Hall 2");
        System.out.println("Name :");
        String hallTwo = br.readLine();

        System.out.println("Contact Number : ");
        Long contactNum2 = Long.parseLong(br.readLine());

        System.out.println("Cost Per Day : ");
        Double costPerDay2 = Double.parseDouble(br.readLine());

        System.out.println("Owner Name : ");
        String ownerName2 = br.readLine();

        System.out.println("Booking Date(dd/mm/yyyy");
        String bookingDate2 = br.readLine();


        Hall obj1 = new Hall(hallOne,contactNum, costPerDay, ownerName, bookingDate);
        Hall obj2 = new Hall(hallTwo, contactNum2, costPerDay2, ownerName2, bookingDate2);

        Hall obj = new Hall();
        obj.equals(obj1, obj2);

        if(obj.equals(obj1,obj2) == true){
            System.out.println("Halls are same");
        }

        else{
            System.out.println("Halls are different");
        }



    }
}
