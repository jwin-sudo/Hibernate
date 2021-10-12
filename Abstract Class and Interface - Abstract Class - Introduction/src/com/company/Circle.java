package com.company;

public class Circle extends Shape {
    Float radius;

    public Circle(){

    }

    public Circle(Float radius){
        this.radius = radius;
    }


    public Float getRadius(){
        return this.radius;
    }

    public void setRadius(Float radius){
        this.radius = radius;
    }

    @Override
    public Double calculatePerimeter(){
        return 2*3.14*radius;
    }

}
