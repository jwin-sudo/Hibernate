package com.company;

public class ItemType {
    String name;
    Double deposit;
    Double costPerDay;

    public ItemType(){

    }

    public ItemType(String name, Double deposit, Double costPerDay){
        this.name = name;
        this.deposit = deposit;
        this.costPerDay = costPerDay;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Double getDeposit(){
        return this.deposit;
    }

    public void setDeposit(Double deposit){
        this.deposit = deposit;
    }

    public Double getCostPerDay(){
        return this.costPerDay;
    }

    public void setCostPerDay(Double costPerDay){
        this.costPerDay = costPerDay;
    }


}
