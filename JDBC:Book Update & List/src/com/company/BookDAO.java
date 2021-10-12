package com.company;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Date;
public class BookDAO {
    private Connection conn;
    private Statement stmt;
    BookDAO() {
        try{
            DBConnection dbc = new DBConnection();
            conn = dbc.getConnection();
            stmt = conn.createStatement();
        } catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public List<Book> list() {
        //Fill your code here
        Book b = new Book();
        List<Book> books = new ArrayList<>();
        try{
            String query = "SELECT * FROM book";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                int id = rs.getInt("id");
                String isbn = rs.getString("isbn");
                String title = rs.getString("title");
                String url = rs.getString("url");
                double price = rs.getDouble("price");
                Date publish_date = rs.getDate("publish_date");
                int author_id = rs.getInt("author_id");
                b.setId(id);
                b.setIsbn(isbn);
                b.setTitle(title);
                b.setUrl(url);
                b.setPrice(price);
                b.setPublishDate(publish_date);
                b.setAuthorId(author_id);
                books.add(b);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return books;
    }
    public void update(Integer bid, Double priceb) {
        //Fill your code here
        try{
            String query = String.format("UPDATE book SET price=%.2f WHERE id=%d",priceb,bid);
            int rs = stmt.executeUpdate(query);
            //System.out.println("rs: " + rs);
            if(rs==1)
            {
                System.out.println("Book price updated successfully");
                System.out.println("After update:");
                this.displayTable();
            }
            else
                System.out.println("No book found with the id "+bid);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void displayTable()
    {
        try{
            String query = "SELECT b.id,b.title,b.isbn,b.price,u.name,b.publish_date,b.url FROM book b INNER JOIN user u WHERE b.author_id=u.id";
            ResultSet rs = stmt.executeQuery(query);
            System.out.printf("%-5s %-5s %-15s %-15s %-15s %15s %s\n",
                    "ID","Title","ISBN","Price","Author","Published date","URL");
            while(rs.next())
            {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String isbn = rs.getString("isbn");
                double price = rs.getDouble("price");
                String name = rs.getString("name");
                Date date = rs.getDate("publish_date");
                String url = rs.getString("url");
                String str = String.format("%-5s %-5s %-15s %-15.2f %-15s %15s %s\n",
                        Integer.toString(id),title,isbn,price,name,date.toString(),url);
                System.out.print(str);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}