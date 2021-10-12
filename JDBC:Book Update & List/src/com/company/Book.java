package com.company;
import java.util. *;

public class Book {
    Integer id;
    String isbn;
    String title;
    String url;
    Double price;
    Date publishDate;
    Integer authorId;

    public Book(){

    }

    public Book(Integer id, String isbn, String title, String url, Double price, Date publishDate, Integer authorId) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.url = url;
        this.price = price;
        this.publishDate = publishDate;
        this.authorId = authorId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }
}
