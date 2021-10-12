package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util. *;
public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of events:");
        Integer num = Integer.parseInt(br.readLine());

        System.out.println("Enter event details in CSV(Customer Name,Ticket Price,No of Seats Booked)");

        TreeMap<Integer, String> tree_map = new TreeMap<>();

        for(int i =0; i< num; i++){
            String eventDetails = br.readLine();
            String[] arr = eventDetails.split(",");


            tree_map.put(Integer.parseInt(arr[2]), arr[1]);
        }




        System.out.format("%-15s %s\n","Ticket Price","Tickets Booked");
        for(Map.Entry<Integer,String> e : tree_map.entrySet()) {
            System.out.format("%-15s %s\n",e.getValue(), e.getKey());
        }


    }
}
