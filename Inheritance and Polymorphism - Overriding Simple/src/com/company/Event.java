package com.company;

public class Event {
    String name;
    String detail;
    String ownerName;

    public Event(){

    }

    public Event(String name, String detail, String ownerName){
        this.name = name;
        this.detail = detail;
        this.ownerName = ownerName;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getDetail(){
        return this.detail;
    }

    public void setDetail(String detail){
        this.detail = detail;
    }

    public String getOwnerName(){
        return this.ownerName;
    }

    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    public Double projectedRevenue(){
        return 0.0;
    }
}


