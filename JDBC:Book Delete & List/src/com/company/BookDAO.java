package com.company;
import java.sql.Connection;
import java.util. *;
import java.sql. *;
import java.util.Date;
public class BookDAO {
    private Connection conn;
    private Statement stmt;

    BookDAO() {
        try {
            DBConnection dbc = new DBConnection();
            conn = dbc.getConnection();
            stmt = conn.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Book> list() {
        Book b = new Book();
        List<Book> books = new ArrayList<>();
        try {
            String query = "SELECT * FROM book";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String isbn = rs.getString("isbn");
                String title = rs.getString("title");
                String url = rs.getString("url");
                double price = rs.getDouble("price");
                Date publishDate = rs.getDate("publishDate");
                int author_id = rs.getInt("author_id");

                b.setId(id);
                b.setIsbn(isbn);
                b.setTitle(title);
                b.setUrl(url);
                b.setPrice(price);
                b.setPublishDate(publishDate);
                b.setAuthorId(author_id);
                books.add(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }

    public void delete(Integer id) {
        try {
            String query = String.format("DELETE FROM book WHERE id=%d", id);
            int rs = stmt.executeUpdate(query);
            if (rs == 1) {
                System.out.println("Book deleted successfully");
                System.out.println("After delete:");
                this.displayTable();
            } else {
                System.out.println("No book found with the id " + id);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void displayTable() {
        try {
            String query = "SELECT b.id, b.title,b.isbn,b.price,b.name,b.publishDate,b.url FROM book b INNER JOIN user u WHERE b.author_id = u.id";
            ResultSet rs = stmt.executeQuery(query);
            System.out.printf("%-5s %-5s %-15s %-15s %-15s %15s %15s\n",
                    "ID", "Title", "ISBN", "Price", "Author", "Published date", "URL");
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String isbn = rs.getString("isbn");
                double price = rs.getDouble("price");
                String author = rs.getString("author");
                Date date = rs.getDate("publishDate");
                String url = rs.getString("url");
                String str = String.format("%-5s %-5s %-15s %-15s %-15s %15s %15s\n",
                        Integer.toString(id), title, isbn, price, author, date.toString(), url);
                System.out.print(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
