package com.q51;

public class Test {
    public static void main(String[] args) {
        Book java=new Book("Core Java","KG Coding","231");
        Book springBoot=new Book("256");
        Book restProject=new Book("453");
        java.borrowBook();
        java.borrowBook();
        java.returnBook();
        java.borrowBook();
        java.returnBook();
        java.returnBook();
        System.out.println(Book.getTotalNoOfBooks());
    }
}
