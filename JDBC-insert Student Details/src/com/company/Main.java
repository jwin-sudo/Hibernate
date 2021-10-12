package com.company;

import java.util.Scanner;
import java.util.List;
class Main{
    public static void main(String args[])throws Exception{
        //Fill your code here
        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();
        List<Student> std = dao.getAllUsers();
        System.out.println("Before the insert");
        if(std.size()==0)
        {
            System.out.println("No records");
        } else
        {
            dao.displayTable();
        }
        //get input
        System.out.println("Enter the Sid:");
        int sid = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the sname:");
        String sname = sc.nextLine();
        System.out.println("Enter the dname:");
        String dname = sc.nextLine();
        System.out.println("Enter the address:");
        String address = sc.nextLine();
        System.out.println("Enter the gpa:");
        int gpa = Integer.parseInt(sc.nextLine());
        Student temp = new Student(sid,sname,dname,address,gpa);
        dao.insertRecord(temp);
        System.out.println("After insert");
        dao.displayTable();
    }
}