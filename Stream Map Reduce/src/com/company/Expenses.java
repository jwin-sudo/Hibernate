package com.company;

public class Expenses {
    String expenseType;
    Double cost;

    public Expenses(){

    }

    public Expenses(String expenseType, Double cost){
        this.expenseType=expenseType;
        this.cost=cost;
    }

    public String getExpenseType(){
        return this.expenseType;
    }

    public void setExpenseType(String expenseType){
        this.expenseType=expenseType;
    }

    public Double getCost(){
        return this.cost;
    }

    public void setCost(Double cost){
        this.cost=cost;
    }
}
