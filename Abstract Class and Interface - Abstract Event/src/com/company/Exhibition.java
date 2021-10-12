package com.company;

public class Exhibition extends Event {
    Integer noOfStalls;
    Double rentPerStall;

    public Exhibition(){

    }

    public Exhibition(String name, String detail, String type, String organiser, Integer noOfStalls, Double rentPerStall){
        super(name, detail, type, organiser);
        this.noOfStalls = noOfStalls;
        this.rentPerStall = rentPerStall;
    }

    public Integer getNoOfStalls(){
        return this.noOfStalls;
    }

    public void setNoOfStalls(Integer noOfStalls){
        this.noOfStalls = noOfStalls;
    }

    public Double getRentPerStall(){
        return this.rentPerStall;
    }

    public void setRentPerStall(Double rentPerStall){
        this.rentPerStall = rentPerStall;
    }

    @Override
    public Double calculateAmount(){
        return noOfStalls*rentPerStall;
    }
}
