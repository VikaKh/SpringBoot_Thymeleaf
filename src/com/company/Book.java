package com.company;

public class Book {
    private String name;
    private Type typeOfBook;
    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getTypeOfBook() {
        return typeOfBook;
    }

    public void setTypeOfBook(Type typeOfBook) {
        this.typeOfBook = typeOfBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String name, Type typeOfBook, String author) {
        this.name = name;
        this.typeOfBook = typeOfBook;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", typeOfBook=" + typeOfBook +
                ", author='" + author + '\'' +
                '}';
    }
}
