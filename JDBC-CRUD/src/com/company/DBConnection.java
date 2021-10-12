package com.company;


import java.sql. *;
import java.util. *;

public class DBConnection {
    public static Connection Connection() throws Exception {
        //Fill your code here
        ResourceBundle rb = ResourceBundle.getBundle("mysql");
        String url = rb.getString("db.url");
        String username = rb.getString("db.username");
        String password = rb.getString("db.password");
        String drivername= "com.mysql.jdbc.Driver";
        Connection c = null;
        try {
            Class.forName(drivername);
            c = DriverManager.getConnection(url,username,password);
            //System.out.println("Connection Object"+c);
        }
        catch(Exception e){

        }
        return c;
    }
}

