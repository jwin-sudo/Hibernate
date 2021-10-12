package com.company;

public abstract class Event {
    String name;
    String detail;
    String type;
    String organiser;

    public Event(){

    }

    public Event(String name, String detail, String type, String organiser){
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.organiser = organiser;
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

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getOrganiser(){
        return this.organiser;
    }

    public void setOrganiser(String organiser){
        this.organiser = organiser;
    }

    public abstract Double calculateAmount();
}
