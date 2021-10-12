package com.company;

public class Receptionist {
    Integer id;
    String name;
    Integer age;
    String hospitalName;
    String shiftTime;

    public Receptionist(){

    }

    public Receptionist(Integer id, String name, Integer age, String hospitalName, String shiftTime){
        this.id = id;
        this.name = name;
        this.age = age;
        this.hospitalName = hospitalName;
        this.shiftTime = shiftTime;
    }

    public Integer getId(){
        return this.id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getAge(){
        return this.age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public String getHospitalName(){
        return this.hospitalName;
    }

    public void setHospitalName(String hospitalName){
        this.hospitalName = hospitalName;
    }

    public String getShiftTime(){
        return this.shiftTime;
    }

    public void setShiftTime(String shiftTime){
        this.shiftTime = shiftTime;
    }

}
