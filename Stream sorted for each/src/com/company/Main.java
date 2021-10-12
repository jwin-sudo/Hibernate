package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util. *;
public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<TicketBooking> bookings = new ArrayList<>();

        System.out.println("Enter number of bookings");
        Integer booking = Integer.parseInt(br.readLine());

        while(booking!=0){
            System.out.println("Enter customer name");
            String customerName = br.readLine();

            System.out.println("Enter number of tickets");
            Integer ticket = Integer.parseInt(br.readLine());

            System.out.println("Enter the price");
            Double price = Double.parseDouble(br.readLine());
            TicketBooking tb = new TicketBooking(customerName, ticket, price);
            bookings.add(tb);
            booking--;
        };

        System.out.format("%-10s %-15s %-15s\n", "Customer", "No Of Tickets", "Price");
        bookings.stream().sorted(Comparator.comparing(TicketBooking::getPrice)).forEach(y->System.out.println(y));
    }
}
