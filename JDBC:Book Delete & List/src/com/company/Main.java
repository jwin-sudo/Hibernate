package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util. *;
public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Before delete:");
        BookDAO bookDao = new BookDAO();
        bookDao.displayTable();
        System.out.println("Enter the book id to be deleted");
        Integer id = Integer.parseInt(br.readLine());
        bookDao.delete(id);

    }
}
