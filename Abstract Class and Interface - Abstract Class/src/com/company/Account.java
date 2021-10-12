package com.company;

public abstract class Account {
    String name;
    int number;
    int balance;
    Date startDate;

    public abstract calculateInterest();

}
