package com.company;

import java.util. *;
public class Training {
    String name;
    Date startDate;
    Date endDate;
    String trainerName;
    Integer studentsRegistered;

    public Training(){

    }

    public Training(String name, Date startDate, Date endDate, String trainerName, Integer studentsRegistered) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.trainerName = trainerName;
        this.studentsRegistered = studentsRegistered;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public Integer getStudentsRegistered() {
        return studentsRegistered;
    }

    public void setStudentsRegistered(Integer studentsRegistered) {
        this.studentsRegistered = studentsRegistered;
    }


}

