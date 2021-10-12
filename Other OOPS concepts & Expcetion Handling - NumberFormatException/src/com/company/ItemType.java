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

    public void setCostPerDay(){
        this.costPerDay = costPerDay;
    }

    @Override
    public String toString(){
        return "The details of the item type are:\nName:" + getName() + "\nDeposit:" + getDeposit() +
        "\nCost Per Day:" + getCostPerDay();
    }
}
