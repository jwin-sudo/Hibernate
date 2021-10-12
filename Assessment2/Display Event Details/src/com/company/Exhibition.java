package com.company;

public class Exhibition extends Event{
    Integer noOfStalls;

    public Exhibition(){

    }

    public Exhibition(String name, String detail, String type, String organiser, Integer noOfStalls){
        super(name, detail, type, organiser);
        this.noOfStalls = noOfStalls;
    }

    public Integer getNoOfStalls() {
        return noOfStalls;
    }

    public void setNoOfStalls(Integer noOfStalls) {
        this.noOfStalls = noOfStalls;
    }

    public void display(){
        System.out.println("Name:" + getName());
        System.out.println("Detail:" + getDetail());
        System.out.println("Type:" + getType());
        System.out.println("Organiser:" + getOrganiser());
        System.out.println("No of Stalls:" + getNoOfStalls());
    }
}
