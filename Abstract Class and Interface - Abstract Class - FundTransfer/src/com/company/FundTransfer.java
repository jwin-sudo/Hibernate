package com.company;

public abstract class FundTransfer {
    String accountNumber;
    Double balance;

    public FundTransfer(){

    }

    public FundTransfer(String accountNumber, Double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public Double getBalance(){
        return this.balance;
    }

    public void setBalance(){
        this.balance = balance;
    }

    public Boolean validate(Double transfer) {
        if(accountNumber.length() == 10 && transfer > 0 && transfer < balance){
            return true;
        }
        else{
            return false;
        }
    }

    public abstract Boolean transfer(Double transfer);
}
