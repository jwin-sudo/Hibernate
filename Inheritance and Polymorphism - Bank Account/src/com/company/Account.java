package com.company;

public class Account {
    String accName;
    String accNo;
    String bankName;

    public Account(){

    }

    public Account(String accName, String accNo, String bankName){
        this.accName = accName;
        this.accNo = accNo;
        this.bankName = bankName;
    }

    public String getAccName(){
        return this.accName;
    }

    public void setAccName(String accName){
        this.accName = accName;
    }

    public String getAccNo(){
        return this.accNo;
    }

    public void setAccNo(String accNo){
        this.accNo = accNo;
    }

    public String getBankName(){
        return this.bankName;
    }

    public void setBankName(String bankName){
        this.bankName = bankName;
    }

    public void display(){
        System.out.println("Account Name: " + getAccName() + "\nAccount Number: " + getAccNo() + "\nBank Name: " + getBankName());
    }
}
