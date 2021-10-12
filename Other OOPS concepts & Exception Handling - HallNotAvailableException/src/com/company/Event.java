package com.company;

public class Event {
    String name;
    String detail;
    Double ownerName;
    String type;

    public Event(){

    }

    public Event(String name, String detail, Double ownerName, String type){
        this.name = name;
        this.detail = detail;
        this.ownerName = ownerName;
        this.type = type;
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

    public Double getOwnerName(){
        return this.ownerName;
    }

    public void setOwnerName(Double ownerName){
        this.ownerName = ownerName;
    }
}
