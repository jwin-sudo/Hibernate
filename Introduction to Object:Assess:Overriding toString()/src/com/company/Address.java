package com.company;

public class Address {
    String addressLine1;
    String addressLine2;
    String city;
    String state;
    Integer pinCode;

    public Address(){

    }

    public Address(String addressLine1, String addressLine2, String city, String state, Integer pinCode){
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }

    public String getAddressLine1(){
        return this.addressLine1;
    }

    public void setAddressLine1(String addressLine1){
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2(){
        return this.addressLine2;
    }

    public void setAddressLine2(String addressLine2){
        this.addressLine2 = addressLine2;
    }

    public String getCity(){
        return this.city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getState(){
        return this.state;
    }

    public void setState(String state){
        this.state = state;
    }

    public Integer getPinCode(){
        return this.pinCode;
    }

    public void setPinCode(Integer pinCode){
        this.pinCode = pinCode;
    }
    @Override
    public String toString(){
        return "The Address Details are\n" + addressLine1 + "\n" + addressLine2 + "\n" +
                city + "\n" + state + "\n" + pinCode;
    }

}
