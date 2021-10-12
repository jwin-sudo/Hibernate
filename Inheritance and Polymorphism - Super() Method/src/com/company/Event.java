package com.company;

public class Event {
    String name;
    String detail;
    String type;
    String ownerName;
    Double costPerDay;

    public Event(){

    }

    public Event(String name, String detail, String type, String ownerName, double costPerDay){
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.ownerName = ownerName;
        this.costPerDay = costPerDay;
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
        this.detail=detail;
    }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getOwnerName(){
        return this.ownerName;
    }

    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    public Double getCostPerDay(){
        return this.costPerDay;
    }

    public void setCostPerDay(Double costPerDay){
        this.costPerDay = costPerDay;
    }

}
