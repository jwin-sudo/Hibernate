package com.company;

public class RTGSTransfer extends FundTransfer {
    public RTGSTransfer(){

    }

    public RTGSTransfer(String accountNumber, Double balance){
        super(accountNumber,balance);
    }
    public Boolean transfer(Double transfer){
        if(transfer > 10000){
            balance = balance - transfer;
            return true;
        }
        else if(transfer == balance){
            return false;
        }
        else{
            return false;
        }
    }
}
