package com.company;

public class User {
    String name;
    String mobile;
    String username;
    String password;

    public User(){

    }

    public User(String name, String mobile, String username, String password){
        this.name = name;
        this.mobile = mobile;
        this.username = username;
        this.password = password;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getMobile(){
        return this.mobile;
    }

    public void setMobile(){
        this.mobile = mobile;
    }

    public String getUsername(){
        return this.username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    @Override
    public String toString(){
        return "Name:" + getName() + "\nMobile:" + getMobile() + "\nUsername:" + getUsername() + "\nPassword:" + getPassword();
    }
}
