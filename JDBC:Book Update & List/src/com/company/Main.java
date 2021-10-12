package com.company;
import java.util. *;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Before update:");
        BookDAO bookDao = new BookDAO();

        bookDao.displayTable();
        BookBO book = new BookBO();
        book.getAllBooks();

        System.out.println("Enter the book id to be updated");
        Integer id = sc.nextInt();

        System.out.println("Enter the new price");
        Double price = sc.nextDouble();

        bookDao.update(id,price);
    }
}
