package com.company;

import java.util.Scanner;
import java.io. *;
import java.util. *;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the User detail");
        String userDetail = sc.nextLine();

        String[] arrOfUser = userDetail.split(",");

        System.out.println("Enter contact details");
        String contact = sc.nextLine();

        String[] arrOfContactDetails = contact.split(",");

        ContactDetail contactDetail = new ContactDetail(arrOfContactDetails[0], arrOfContactDetails[1],
                arrOfContactDetails[2], arrOfContactDetails[3], arrOfContactDetails[4]);
        User user = new User(arrOfUser[0], contactDetail, arrOfUser[1], arrOfUser[2]);


        //System.out.println(Arrays.toString(arrOfStr));

        System.out.println(user.toString());
        System.out.println(contactDetail.toString());
    }
}
