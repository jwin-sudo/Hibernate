package com.company;

public class Address {
    String addressLine2;
    String addressLine1;
    String city;
    String state;
    String pinCode;
    Contact contact;

    public Address(){

    }

    public Address(String addressLine1, String addressLine2, String city, String state, String pinCode, Contact contact){
        this.addressLine2 = addressLine2;
        this.addressLine1 = addressLine1;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.contact = contact;
    }

    public String getAddressLine2(){
        return this.addressLine2;
    }

    public void setAddressLine2(String addressLine2){
        this.addressLine2=addressLine2;
    }

    public String getAddressLine1(){
        return this.addressLine1;
    }

    public void setAddressLine1(String addressLine1){
        this.addressLine1=addressLine1;
    }

    public String getCity(){
        return this.city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getState(){
        return this.state = state;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getPinCode(){
        return this.pinCode;
    }

    public void setPinCode(String pinCode){
        this.pinCode = pinCode;
    }

    public Contact getContact(){
        return this.contact;
    }

    public void setContact(Contact contact){
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Mobile:" + contact.mobile + "\nAlternate Mobile:" + contact.alternateMobile +
            "\nLandline:" + contact.landline + "\nEmail:" + contact.email + "\nAddress Line 1:" + getAddressLine1() +
                "\nAddress Line 2:" + getAddressLine2() + "City:" + getCity() + "State:" + getState() +
                "\nPincode:" + getPinCode();
    }


}
