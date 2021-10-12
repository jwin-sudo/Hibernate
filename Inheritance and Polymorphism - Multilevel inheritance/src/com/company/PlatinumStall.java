package com.company;

public class PlatinumStall extends GoldStall {
    Integer projector;

    public PlatinumStall(){

    }


    public PlatinumStall(String name, String detail, String owner, Integer cost, Integer tvSet, Integer projector){
        super(name, detail, owner, cost, tvSet);
        this.projector = projector;
    }

    public Integer getProjector(){
        return this.projector;
    }

    public void setProjector(Integer projector){
        this.projector = projector;
    }

    @Override
    public String toString(){
        return "Stall Name:" + getName() + "\nDetails:" + getDetail() + "\nOwner Name:" + getOwner() +
                "\nTV Sets:" + getTvSet() + "\nProjectors:" + getProjector() + "\nTotal Cost:" +
                (getCost()+getTvSet()*100 + getProjector()*500);
    }
}
