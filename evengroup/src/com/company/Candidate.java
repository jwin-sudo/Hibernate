package com.company;

import java.util.Date;

public class Candidate {
    String name;
    String category;
    Date packedDate;
    String weight;
    Double cost;

    public Candidate(){

    }


    public Candidate(String name, String category, Date packedDate, String weight, Double cost) {
        this.name = name;
        this.category = category;
        this.packedDate = packedDate;
        this.weight = weight;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getPackedDate() {
        return packedDate;
    }

    public void setPackedDate(Date packedDate) {
        this.packedDate = packedDate;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
