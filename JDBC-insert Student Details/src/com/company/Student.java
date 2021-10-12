package com.company;

import java.util.Objects;
public class Student {
    private int    sid;
    private String    sname;
    private String	dname;
    private String	address;
    private int	gpa;
    public Student() {
    }
    public Student(int sid, String sname, String dname, String address, int gpa) {
        this.sid = sid;
        this.sname = sname;
        this.dname = dname;
        this.address = address;
        this.gpa = gpa;
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
    public boolean equals(Object o) {
        //Fill your code here
        Student s = (Student) o;
        if(s.sid==this.sid)
            return true;
        else
            return false;
    }
    public int hashCode() {
        //Fill your code here
        return Objects.hash(sid);
    }
    public String toString() {
        //Fill your code here
        String str = String.format("Sid:%s\nSname:%s\nDname:%s\nAddress:%s\nGPA:%d\n",
                sid,sname,dname,address,gpa);
        return str;
    }
}