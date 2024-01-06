package com.q51;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;
    private boolean isReturned;
    private static int totalNoOfBooks;
    static { //At the time of class loading this will be executed only once
        totalNoOfBooks=0;
    }
    {   //When ever an object will be created this block will be executed
        totalNoOfBooks++;
        isBorrowed=false;
        isReturned=false;
    }
    public Book(String isbn){
        this("not mentioned","unknown",isbn);
    }
    public Book(String title,String author,String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;

    }
    public void borrowBook(){
        if(isBorrowed==false) {
            isBorrowed = true;
            System.out.println("Enjoy the book");
        }else {
            System.out.println("Book is already borrowed");
        }
    }
    public void returnBook(){
        if(isBorrowed==true){
            isReturned=true;
            isBorrowed=false;
            System.out.println("How was the book? Leave your rating");
        } else if (isBorrowed==false) {
            System.out.println("Book is already in library");
        }
    }
    public static int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }
}
