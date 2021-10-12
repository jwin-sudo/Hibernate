package com.company;

public class GoldStall extends SilverStall{
    Integer tvSet;

    public GoldStall(){

    }

    public GoldStall(String name, String detail, String owner, Integer cost, Integer tvSet){
        super(name, detail, owner, cost);
        this.tvSet = tvSet;
    }
    public Integer getTvSet(){
        return this.tvSet;
    }

    public void setTvSet(Integer tvSet) {
        this.tvSet = tvSet;
    }

    @Override
    public String toString(){
        return "Stall Name:" + getName() + "\nDetails:" + getDetail() + "\nOwner Name:" + getOwner() +
                "\nTV Sets:" + getTvSet() + "\nTotal Cost:" + (getTvSet()*100 + getCost());
    }
}
