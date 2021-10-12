package com.company;

public class Address{
    String line1;
    String line2;
    String city;
    String country;
    Integer zipCode;

    public Address(){

    }

    public Address(String line1, String line2, String city, String country, Integer zipCode){
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
    }

    public String getLine1(){
        return this.line1;
    }

    public void setLine1(String line1){
        this.line1 = line1;
    }

    public String getLine2(){
        return this.line2;
    }

    public void setLine2(String line2){
        this.line2 = line2;
    }

    public String getCity(){
        return this.city;
    }

    public void setCity(){
        this.city = city;
    }

    public String getCountry(){
        return this.country;
    }

    public void setCountry(){
        this.country = country;
    }

    public Integer getZipCode(){
        return this.zipCode;
    }

    public void setZipCode(Integer zipCode){
        this.zipCode = zipCode;
    }

    @Override
    public String toString(){
        return "Address Details :\n" + getLine1() + ",\n" + getLine2() + ",\n" + getCity() + " - " + getZipCode() + "\n" + getCountry();
    }
}
