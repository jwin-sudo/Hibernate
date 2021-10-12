package com.company;

public class Book {
    String title;
    String category;
    String author;
    Double price;

    public Book(){

    }

    public Book(String title, String category, String author, Double price){
        this.title = title;
        this.category = category;
        this.author=author;
        this.price=price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
