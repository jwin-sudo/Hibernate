package com.company;

public class PremiumStall implements Stall {
    String stallName;
    Integer cost;
    String ownerName;
    Integer projector;

    public PremiumStall(){

    }

    public PremiumStall(String stallName, Integer cost, String ownerName, Integer projector){
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.projector = projector;
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

    public Integer getProjector(){
        return this.projector;
    }

    public void setProjector(Integer projector){
        this.projector = projector;
    }

    public void display(){
        System.out.println("Stall Name:" + getStallName());
        System.out.println("Cost:" + getCost() + ".Rs");
        System.out.println("Owner Name:" +getOwnerName());
        System.out.println("Number of Projectors:" + getProjector());
    }
}
