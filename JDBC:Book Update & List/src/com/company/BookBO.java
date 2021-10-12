package com.company;
import java.util. *;
import java.util.List;
public class BookBO {
    public List<Book> getAllBooks() {
        //Fill your code here
        return new BookDAO().list();
    }
    public void updateBook(Integer bid, Double priceb) {
        //Fill your code here
        BookDAO dao = new BookDAO();
        dao.update(bid,priceb);
    }
    public void displayTable() {
        BookDAO dao = new BookDAO();
        dao.displayTable();
    }
}