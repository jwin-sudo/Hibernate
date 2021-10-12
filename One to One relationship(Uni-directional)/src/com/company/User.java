package com.company;

public class User {
    String name;
    String username;
    String password;
    ContactDetail contactDetail;

    public User(){

    }

    public User(String name, ContactDetail contactDetail, String username, String password){
        this.name = name;
        this.contactDetail = contactDetail;
        this.username = username;
        this.password = password;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public ContactDetail getContactDetail(){
        return contactDetail;
    }

    public void setContactDetail(ContactDetail contactDetail){
        this.contactDetail = contactDetail;
    }

    @Override
    public String toString(){
        return "Name:" + getName() + "\nUsername:" + getUsername() + "\nPassword:" + getPassword();
    }
}
