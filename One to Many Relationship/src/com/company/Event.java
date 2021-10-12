package com.company;

public class Event {
    String name;
    String detail;
    String type;
    String organiserName;

    public Event(){

    }


    public Event(String name, String detail, String type, String organiserName){
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.organiserName = organiserName;
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

    public void setDetail(){
        this.detail = detail;
    }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }
    public String getOrganiserName(){
        return this.organiserName;
    }

    public void setOrganiserName(String organiserName){
        this.organiserName = organiserName;
    }

}
