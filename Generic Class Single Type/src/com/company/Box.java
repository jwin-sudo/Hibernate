package com.company;

public class Box<T1,T2,T3> {
    public T1 length;
    public T2 width;
    public T3 depth;

    public Box(){

    }

    public Box(T1 length, T2 width, T3 depth){
        this.length = length;
        this.width = width;
        this.depth = depth;
    }

    public void addLength(T1 length){
        this.length = length;
    }

    public T1 getLength(){
        return length;
    }

    public void addWidth(T2 width){
        this.width = width;
    }

    public T2 getWidth(){
        return width;
    }

    public void addDepth(T3 depth){
        this.depth = depth;
    }

    public T3 getDepth(){
        return depth;
    }

    public void print(){
        System.out.println("Length : " + getLength());
        System.out.println("Width : " + getWidth());
        System.out.println("Depth : " + getDepth());
    }
}
