package ru.mirea.lab2.book;

public class Book {
    private String author = "thor";
    private String name = "ham";
    private int year = 2;

    Book(String author, String name, int year){
        this.author = author;
        this.name = name;
        this.year = year;
    }
    public int GetYear() {
        return year;
    }

    public String GetName() {
        return name;
    }

    public String GetAuthor() {
        return author;
    }

    public void SetAuthor(String author) {
        this.author = author;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public void SetYear(int year) {
        this.year = year;
    }
}
