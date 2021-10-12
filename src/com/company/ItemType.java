package com.company;

public class ItemType {
    String name;
    Double deposit;
    Double costPerDay;

    public ItemType(String name, Double deposit, Double costPerDay){
        this.name = name;
        this.deposit = deposit;
        this.costPerDay = costPerDay;
    }

    public ItemType(){

    }

    @Override
    public String toString() {
        String dep = String.format("%.1f", deposit);
        String cp = String.format("%.1f", costPerDay);
        return String.format("%-20s%-20s%-20s", name, dep, cp);
    }

}
