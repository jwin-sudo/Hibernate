package com.company;

public class IMPSTransfer extends FundTransfer {
    public IMPSTransfer(){

    }

    public IMPSTransfer(String accountNumber, Double balance){
        super(accountNumber,balance);
    }
    public Boolean transfer(Double transfer){
        if(transfer + 0.02*transfer < balance){
            balance = balance - transfer - .02*transfer;
            return true;
        }
        else{
            return false;
        }
    }
}
