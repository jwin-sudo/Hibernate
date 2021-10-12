package com.company;

import org.omg.CORBA.Current;

public class CurrentAccount extends Account{
    String tinNumber;


    public CurrentAccount(){

    }

    public CurrentAccount(String accName, String accNo, String bankName, String tinNumber){
        super(accName, accNo, bankName);
        this.tinNumber = tinNumber;
    }

    public String getTinNumber(){
        return tinNumber;
    }

    public void setTinNumber(String tinNumber){
        this.tinNumber = tinNumber;
    }

    public void display(){
        super.display();
        System.out.println("TIN Number:" + tinNumber);
    }





}
