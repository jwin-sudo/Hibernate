package com.company;
import java.util. *;

public class BookBO {
    public List<Book> getAllBooks(){
        return new BookDAO().list();
    }
    public void deleteBook(Integer id){
        BookDAO dao = new BookDAO();
        dao.delete(id);
    }
    public void displayTable(){
        BookDAO dao = new BookDAO();
        dao.displayTable();
    }
}
