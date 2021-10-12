package com.company;

import sun.security.krb5.internal.Ticket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util. *;
public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<TicketBooking> arr = new ArrayList<>();

        System.out.println("Enter the number of customers");
        Integer num = Integer.parseInt(br.readLine());


        if(num < 0){
            System.out.println("Invalid Input");
        }

        else {
            System.out.println("Enter the booking price accordingly with customer name in CSV(Customer Name,Price)");
            for (int i = 0; i < num; i++) {
                String bookingDetail = br.readLine();
                String[] bookingToStr = bookingDetail.split(",");
                TicketBooking ticketBook = new TicketBooking(bookingToStr[0],Integer.parseInt(bookingToStr[1]));
                arr.add(ticketBook);
            }
        }


        System.out.println(arr.stream().min(Comparator.comparing(TicketBooking::getPrice)));
    }


}
