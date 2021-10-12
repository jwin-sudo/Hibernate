package com.company;

public class NEFTTransfer extends FundTransfer{
    public NEFTTransfer(){

    }

    public NEFTTransfer(String accountNumber, Double balance){
        super(accountNumber,balance);
    }
    public Boolean transfer(Double transfer){
        if(transfer + 0.05*transfer < balance){
            balance = balance - transfer - .05*transfer;
            return true;
        }
        else if(transfer + 0.05*transfer == balance){
            return false;
        }
        else{
            return false;
        }
    }
}
