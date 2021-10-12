package com.company;

public class Hall {
    String name;
    String contactNumber;
    Double costPerDay;
    String ownerName;

    public Hall(){

    }

    public Hall(String name, String contactNumber, Double costPerDay, String ownerName){
        this.name = name;
        this.contactNumber = contactNumber;
        this.contactNumber = contactNumber;
        this.ownerName = ownerName;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getContactNumber(){
        return this.contactNumber;
    }

    public void setContactNumber(String contactNumber){
        this.contactNumber = contactNumber;
    }

    public Double getCostPerDay(){
        return this.costPerDay;
    }

    public void setCostPerDay(Double costPerDay){
        this.costPerDay = costPerDay;
    }

    public String getOwnerName(){
        return this.ownerName;
    }

    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }
}
