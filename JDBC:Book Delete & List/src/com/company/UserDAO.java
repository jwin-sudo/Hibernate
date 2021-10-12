package com.company;
import java.util. *;
import java.sql. *;
public class UserDAO {
    public ArrayList<User> getUserById(Integer id){
        ArrayList<User> u = new ArrayList<>();
        try{
            DBConnection dbConnection = new DBConnection();
            Connection conn = dbConnection.getConnection();
            Statement stmt = conn.createStatement();
            String query = String.format("SELECT * FROM user WHERE id='%s'", id);
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                String name = rs.getString("name");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String contactNumber = rs.getString("contactNumber");
                String role = rs.getString("role");
                u.add(new User(id,name,username,password,contactNumber,role));
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return u;

    }
}
