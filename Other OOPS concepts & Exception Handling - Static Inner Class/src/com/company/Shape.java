package com.company;

public class Shape {
    static Double value1;
    static Double value2;

    public Shape(){

    }
    public Shape(Double value1, Double value2){
        this.value1 = value1;
        this.value2 = value2;
    }



    public static class Inner_Rectangle{
        public Double computeRectangleArea(){
            return value1*value2;
        }
    }

    public static class Inner_Triangle{
        public Double computeTriangleArea(){
            return .5*value1*value2;
        }
    }
}
