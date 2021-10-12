package com.company;

import javafx.stage.Stage;

public class StageEvent extends  Event {
    Integer noOfSeats;

    public StageEvent(){

    }

    public StageEvent(String name, String detail, String type, String organiser, Integer noOfSeats){
        super(name, detail, type, organiser);
        this.noOfSeats = noOfSeats;
    }

    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public void display(){
        System.out.println("Name:" + getName());
        System.out.println("Detail:" + getDetail());
        System.out.println("Type:" + getType());
        System.out.println("Organiser:" + getOrganiser());
        System.out.println("No of Seats:" + getNoOfSeats());
    }
}
