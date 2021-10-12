package com.company;

public class Exhibition extends Event {
    Integer noOfStall;

    public Exhibition(){

    }

    public Exhibition(String name, String detail, String type, String ownerName, Double costPerDay, Integer noOfStall){
        super(name, detail, type, ownerName, costPerDay);
        this.noOfStall = noOfStall;
    }

    public Integer getNoOfStall(){
        return this.noOfStall;
    }

    public void setNoOfStall(Integer noOfStall){
        this.noOfStall = noOfStall;
    }

}
