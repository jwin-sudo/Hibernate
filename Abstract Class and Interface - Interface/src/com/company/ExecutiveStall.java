package com.company;

public class ExecutiveStall {
    String stallName;
    Integer cost;
    String ownerName;
    Integer screen;

    public ExecutiveStall(){

    }

    public ExecutiveStall(String stallName, Integer cost, String ownerName, Integer screen){
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.screen = screen;
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

    public Integer getScreen(){
        return this.screen;
    }

    public void setScreen(Integer screen){
        this.screen = screen;
    }

    public void display(){
        System.out.println("Stall Name:" + getStallName());
        System.out.println("Cost:" + getCost() + ".Rs");
        System.out.println("Owner Name:" +getOwnerName());
        System.out.println("Number of Screens:" + getScreen());
    }
}
