package com.company;
import java.util. *;
import java.sql. *;
import java.util.ArrayList;

public class UserDAO {
    public ArrayList<User> getUserBtId(Integer i){
        ArrayList<User> u = new ArrayList<>();
        try{
            DBConnection dbConnection = new DBConnection();
            Connection conn = dbConnection.getConnection();
            Statement stmt = conn.createStatement();
            String query = String.format("SELECT * FROM user WHERE id='%s'", i);
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                //int id = rs.getInt("id");
                String name = rs.getString("name");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String contactNumber = rs.getString("contactNumber");
                String role = rs.getString("role");
                u.add(new User(i,name,username,password,contactNumber,role));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return u;
    }
}
