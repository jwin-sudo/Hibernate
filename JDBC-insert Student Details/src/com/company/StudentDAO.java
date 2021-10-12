package com.company;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;
public class StudentDAO {
    private Connection conn;
    private Statement stmt;
    StudentDAO() {
        try{
            DBConnection dbc = new DBConnection();
            conn = dbc.getConnection();
            stmt = conn.createStatement();
        } catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void insertRecord(Student sobj) {
        //Fill your code here
        try{
            int sid = sobj.getSid();
            String sname = sobj.getSname();
            String dname = sobj.getDname();
            String address = sobj.getAddress();
            int gpa = sobj.getGpa();
            String query = String.format("INSERT INTO student VALUES (%d,'%s','%s','%s',%d)",
                    sid,sname,dname,address,gpa);
            int rs = stmt.executeUpdate(query);
//            System.out.println("rs:" + rs);
//            if(rs==1)
//            {
//                System.out.println("Student inserted successfully");
////                System.out.println("After insert\n"+sobj);
//            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public List<Student> getAllUsers() {
        //Fill your code here
        Student s;
        List<Student> students = new ArrayList<>();
        try{
            String query = "SELECT * FROM student";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                int sid = rs.getInt("sid");
                String sname = rs.getString("sname");
                String dname = rs.getString("dname");
                String address = rs.getString("address");
                int gpa = rs.getInt("gpa");
                s = new Student(sid,sname,dname,address,gpa);
                students.add(s);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return students;
    }
    public void displayTable(){
        List<Student> std = getAllUsers();
        for(Student s: std)
        {
            System.out.println(s);
        }
    }
}