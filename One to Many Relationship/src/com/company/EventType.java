package com.company;

import java.util.ArrayList;

public class EventType {

    String name;
    ArrayList<Event> list;

    public EventType(){

    }

    public EventType(String name, ArrayList<Event> list){
        this.name = name;
        this.list = list;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public ArrayList<Event> getList(){
        return this.list;
    }

    public void setList(ArrayList<Event> list){
        this.list = list;
    }

}
