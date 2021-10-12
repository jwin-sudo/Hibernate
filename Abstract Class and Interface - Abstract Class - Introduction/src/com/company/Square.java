package com.company;

public class Square extends Shape{
    Float side;

    public Square(){

    }


    public Square(Float side){
        this.side = side;
    }

    public Float getSide(){
        return this.side;
    }

    public void setSide(Float side){
        this.side = side;
    }

    @Override
    public Double calculatePerimeter(){
        return Double.valueOf(2*(side+side));
    }

}
