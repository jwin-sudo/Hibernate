package com.company;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
class StudentDAO{
    public ArrayList<Student> readData(String dname) {
        //Fill your code here
        ArrayList<Student> s = new ArrayList<>();
        try{
            DBConnection dbConnection = new DBConnection();
            Connection conn = dbConnection.getConnection();
            Statement stmt = conn.createStatement();
            String query = String.format("SELECT * FROM student WHERE dname='%s'",dname);
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                int sid = rs.getInt("sid");
                String sname = rs.getString("sname");
                //String _dname = rs.getString("dname");
                String address = rs.getString("address");
                int gpa = rs.getInt("gpa");
                s.add(new Student(sid,sname,dname,address,gpa));
            }
        } catch(Exception e)
        {
            e.printStackTrace();
        }
        return s;
    }
}