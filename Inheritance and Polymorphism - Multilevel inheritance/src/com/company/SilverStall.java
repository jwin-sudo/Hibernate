package com.company;

public class SilverStall {
    String name;
    String detail;
    String owner;
    Integer cost;


    public SilverStall(){

    }

    public SilverStall(String name, String detail, String owner, Integer cost){
        this.name = name;
        this.detail = detail;
        this.owner = owner;
        this.cost = cost;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDetail(){
        return this.detail;
    }

    public void setDetail(String detail){
        this.detail = detail;
    }

    public String getOwner(){
        return this.owner;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public Integer getCost(){
        return this.cost;
    }

    public void setCost(Integer cost){
        this.cost = cost;
    }


    @Override
    public String toString(){
        return "Stall Name:" + getName() + "\nDetails:" + getDetail() + "\nOwner Name:" + getOwner() + "\nTotal Cost:" + getCost();
    }

}
