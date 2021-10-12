package com.company;

public class CurrentAccount extends Account {
    public CurrentAccount(String name, String accountNumber, Double balance){
        super(name, accountNumber, balance);
    }
    public Integer computeMaintainanceCharge(Integer noOfYears){
        return 100*noOfYears+200;
    }
}
