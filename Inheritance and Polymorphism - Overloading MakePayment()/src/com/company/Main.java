package com.company;

import java.util. *;
import java.io. *;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Enter the Booking details");
        String bookingDetails = br.readLine();
        //System.out.println();
        String[] bookingDetailsToStr = bookingDetails.split(",");
        TicketBooking arr = new TicketBooking(bookingDetailsToStr[0], bookingDetailsToStr[1], Integer.parseInt(bookingDetailsToStr[2]));

        System.out.println("Payment mode\n1.Cash payment\n2.Wallet payment\n3.Credit card payment");
        int num = Integer.parseInt(br.readLine());

        if (num == 1) {
            System.out.println("Enter the amount");
            int amount = Integer.parseInt(br.readLine());

            System.out.println("Stage event:" + bookingDetailsToStr[0]);
            System.out.println("Customer:" + bookingDetailsToStr[1]);
            System.out.println("Number of seats:" + Integer.parseInt(bookingDetailsToStr[2]));
            arr.makePayment((double) amount);
        } else if (num == 2) {
            System.out.println("Enter the amount");
            int amount2 = Integer.parseInt(br.readLine());

            System.out.println("Enter the wallet number");
            String walletNum = br.readLine();

            System.out.println("Stage event:" + bookingDetailsToStr[0]);
            System.out.println("Customer:" + bookingDetailsToStr[1]);
            System.out.println("Number of seats:" + Integer.parseInt(bookingDetailsToStr[2]));
            arr.makePayment(walletNum, (double) amount2);
        } else if (num == 3) {
            System.out.println("Enter card holder name");
            String cardHolder = br.readLine();

            System.out.println("Enter the amount");
            int amount3 = Integer.parseInt(br.readLine());

            System.out.println("Enter the credit card type");
            String creditCard = br.readLine();

            System.out.println("Enter the CCV number");
            String ccvNumber = br.readLine();

            System.out.println("Stage event:" + bookingDetailsToStr[0]);
            System.out.println("Customer:" + bookingDetailsToStr[1]);
            System.out.println("Number of seats:" + Integer.parseInt(bookingDetailsToStr[2]));


            arr.makePayment(creditCard, ccvNumber, cardHolder, (double) amount3);
        }

        else{
            System.out.println("Invalid choice");
        }

    }
}

