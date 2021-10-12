package com.company;
import java.sql.Connection;
import java.sql. *;
import java.util. *;

public class DBConnection {
    private Connection conn;
    DBConnection(){
        conn = null;
    }
    public static Connection Connection() throws ClassNotFoundException, SQLException{
        ResourceBundle rb = ResourceBundle.getBundle("mysql");
        String url = rb.getString("db.url");
        String username = rb.getString("db.username");
        String password = rb.getString("db.password");
        String drivername = "com.mysql.jdbc.Driver";
        Connection c = null;
        try {
            Class.forName(drivername);
            c = DriverManager.getConnection(url,username,password);
        }catch(Exception e){
            e.printStackTrace();
        }
        return c;
    }

    public Connection getConnection(){
        try{
            if(conn == null){
                conn = Connection();
            }
                return conn;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

}
