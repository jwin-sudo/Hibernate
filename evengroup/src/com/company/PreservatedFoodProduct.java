package com.company;

import java.util.Date;

public class PreservatedFoodProduct extends Candidate {
    String preservedType;
    Integer noOfDays;

    public PreservatedFoodProduct(){

    }

    public PreservatedFoodProduct(String preservedType, Integer noOfDays){
        super();
        this.preservedType = preservedType;
        this.noOfDays = noOfDays;
    }

    public String getPreservedType() {
        return preservedType;
    }

    public void setPreservedType(String preservedType) {
        this.preservedType = preservedType;
    }

    public Integer getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(Integer noOfDays) {
        this.noOfDays = noOfDays;
    }
}
