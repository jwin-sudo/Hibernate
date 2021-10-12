package com.company;

public class Exhibition extends Event {
    Integer noOfStalls;

    public Exhibition(){

    }

    public Exhibition(String name, String detail, String ownerName, Integer noOfStalls){
        super(name, detail,ownerName);
        this.noOfStalls = noOfStalls;
    }


    public Integer getNoOfStalls(){
        return this.noOfStalls;
    }

    public void setNoOfStalls(Integer noOfStalls){
        this.noOfStalls = noOfStalls;
    }

    public Double projectedRevenue(){
            return Double.parseDouble(String.valueOf(this.noOfStalls))*10000;
    }
}
