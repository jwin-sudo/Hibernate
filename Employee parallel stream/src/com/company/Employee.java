package com.company;

public class Employee {
    String name;
    Double salary;

    public Employee(){

    }

    public Employee(String name, Double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Double getSalary(){
        return this.salary;
    }

    public void setSalary(Double salary){
        this.salary = salary;
    }

    @Override
    public String toString(){
        return String.format("%-10s%-15s\n", this.name, this.salary);
    }
}
