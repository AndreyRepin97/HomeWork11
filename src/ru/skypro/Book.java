package ru.skypro;


import java.util.Objects;

public class Book {
    private String bookName;
    private Author authorName;
    int data;

    public Book(String bookName, Author authorName, int data) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.data = data;
    }

    public String getBookName() {
        return bookName;

    }

    public int getData() {
        return data;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public int setData(int data) {
        this.data = data;
        return data;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookName.equals(book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName);
    }
}
