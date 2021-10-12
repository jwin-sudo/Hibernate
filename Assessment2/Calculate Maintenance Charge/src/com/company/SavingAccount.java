package com.company;

public class SavingAccount extends Account{
    public SavingAccount(String name, String accountNumber, Double balance) {
        super(name, accountNumber, balance);
    }
    public Integer computeMaintainanceCharge(Integer noOfYears){
        return 2*50*noOfYears+50;
    }
}
