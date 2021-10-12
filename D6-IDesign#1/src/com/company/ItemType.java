package com.company;

import java.text.*;
import java.io. *;

public class ItemType {

    //Fill your code

    String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    double costPerDay;

    public double getCostPerDay(){
        return costPerDay;
    }

    public void setCostPerDay(double costPerDay){
        this.costPerDay = costPerDay;
    }

    double deposit;

    public double getDeposit(){
        return deposit;
    }

    public void setDeposit(double deposit){
        this.deposit = deposit;
    }

    ItemType(String name, double costPerDay, double deposit){
        this.name = name;
        this.costPerDay = costPerDay;
        this.deposit = deposit;
    }

    ItemType(){

    }



    public void display(){
        System.out.println("Item type details");
        System.out.println("Name : " + name);
        System.out.format("CostPerDay : %.2f\n", costPerDay);
        System.out.format("Deposit : %.2f\n", deposit);
    }
}


