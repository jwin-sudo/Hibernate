package com.company;

public class Student {
    int sid;
    String sname;
    String dname;
    String address;
    int gpa;

    public Student(int sid, String sname, String dname, String address, int gpa) {
        this.sid = sid;
        this.sname = sname;
        this.dname = dname;
        this.address = address;
        this.gpa = gpa;
    }
    public Student(){

    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }
}
