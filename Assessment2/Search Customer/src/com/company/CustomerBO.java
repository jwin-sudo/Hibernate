package com.company;

import java.util. *;
public class CustomerBO extends Customer{

    public CustomerBO(){

    }
    public CustomerBO(String name, String email, String phoneNO){
        super(name, email,phoneNO);
        this.name = name;
        this.email = email;
        this.phoneNO = phoneNO;
    }

    public void createCustomer(String customerDetails, List<Customer> customerList){
        System.out.println("Customer created successfully");
    }

    public void display(List<Customer> customerList){
        System.out.println("Customer Details");
        System.out.format("%s%5s%5s", "Name", "Email", "PhoneNO\n");
        System.out.format("%s%5s%5s", customerList.get(0).getName(), customerList.get(0).getEmail(), customerList.get(0).getPhoneNO());
        System.out.println("\n");
    }

    /*
    public Customer searchCustomerFromList(String email, List<Customer>customerList){

    }

 */
}
