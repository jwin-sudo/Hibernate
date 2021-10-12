package com.company;

public class GoldStall implements Stall {
    String stallName;
    Integer cost;
    String ownerName;
    Integer tvSet;

    public GoldStall(){

    }

    public GoldStall(String stallName, Integer cost, String ownerName, Integer tvSet){
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.tvSet = tvSet;
    }

    public String getStallName(){
        return this.stallName;
    }

    public void setStallName(String stallName){
        this.stallName = stallName;
    }

    public Integer getCost(){
        return this.cost;
    }

    public void setCost(Integer cost){
        this.cost = cost;
    }

    public String getOwnerName(){
        return this.ownerName;
    }

    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    public Integer getTvSet(){
        return this.tvSet;
    }

    public void setTvSet(Integer tvSet){
        this.tvSet = tvSet;
    }


    public void display() {
        System.out.println("Stall Name:" + getStallName());
        System.out.println("Cost:" + getCost() + ".Rs");
        System.out.println("Owner Name:" + getOwnerName());
        System.out.println("Number of TV sets:" + getTvSet());
    }
}
