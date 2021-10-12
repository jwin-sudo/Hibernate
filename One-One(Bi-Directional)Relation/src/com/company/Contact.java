package com.company;

public class Contact {
    Integer mobile;
    Integer alternateMobile;
    Integer landline;
    String email;
    Address address;

    public Contact(){

    }

    public Contact(Integer mobile, Integer alternateMobile, Integer landline, String email, Address address){
        this.mobile = mobile;
        this.alternateMobile = alternateMobile;
        this.landline = landline;
        this.email = email;
        this.address = address;
    }

    public Integer getMobile(){
        return this.mobile;
    }

    public void setMobile(Integer mobile){
        this.mobile = mobile;
    }

    public Integer getAlternateMobile(){
        return this.alternateMobile;
    }

    public void setAlternateMobile(Integer alternateMobile){
        this.alternateMobile = alternateMobile;
    }

    public Integer getLandline(){
        return this.landline;
    }

    public void setLandline(Integer landline){
        this.landline=landline;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public Address getAddress(){
        return this.address;
    }

    public void setAddress(Address address){
        this.address=address;
    }


}
