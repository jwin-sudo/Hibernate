package com.company;

import com.sun.org.apache.xalan.internal.xsltc.dom.AdaptiveResultTreeImpl;

import java.io. *;
import java.util. *;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);

        //ArrayList<Address> arr = new ArrayList<Address>();
        //ArrayList<Contact> arr2 = new ArrayList<Contact>();

        Address arr = new Address();
        Contact arr2 = new Contact();

        System.out.println("Enter the number of contact-address pair:");
        int numberOfContact = sc.nextInt();

        String[] addy;
        String[] contact;
        for(int i =1; i<=numberOfContact; i++){
            System.out.println("Enter the address " + i );
            String str = sc.nextLine();
            addy = str.split(",");

            arr = new Address(addy[0],addy[1],addy[2],addy[3],addy[4], arr2);

            System.out.println("Enter the contact " + i );
            String str2 = sc.nextLine();
            contact = str2.split(",");

            arr2 = new Contact(contact[])
        }






        System.out.println("Enter the mobile of the contact to be searched:");
        int search = sc.nextInt();

        if(arr.contains(search)){
            for(int i = 1; i<= numberOfContact; i++){
                System.out.println("Contact-Address " + i);
                addressObj.toString();
            }
        }

        else{
            System.out.println("No contact with mobile" + search + "found");
        }
    }
}
