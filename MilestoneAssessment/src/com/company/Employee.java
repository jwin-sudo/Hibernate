package com.company;

import java.util.*;

public class Employee{
    String name;
    String email;
    Integer experience;
    Date joinedDate;
    Double salary;

    public Employee() {
        super();
    }

    public Employee(String name, String email, Integer experience, Date joinedDate, Double salary) {
        this.name = name;
        this.email = email;
        this.experience = experience;
        this.joinedDate = joinedDate;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Date getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

}

