package ru.skypro;

public class Book {
    private String bookName;
    private Author authorName;
    int data;

    public Book(String bookName, Author authorName, int data){
        this.bookName = bookName;
        this.authorName = authorName;
        this.data = data;
    }
    public String getBookName(){
        return bookName;

    }
    public int getData() {
        return data;
    }
    public Author getAuthorName() {
        return authorName;
    }
    public int setData(int data){
        this.data=data;
        return data;
    }
}