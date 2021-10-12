package com.company;

public class Rectangle extends  Shape{
    Float length;
    Float breadth;

    public Rectangle(){

    }

    public Rectangle(Float length, Float breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public Float getLength(){
        return this.length;
    }

    public void setLength(Float length){
        this.length = length;
    }

    public Float getBreadth(){
        return this.breadth;
    }

    public void setBreadth(Float breadth){
        this.breadth = breadth;
    }

    @Override
    public Double calculatePerimeter(){
        return Double.valueOf(2*(length+breadth));
    }
}
