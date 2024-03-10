package org.example.inheritance;

public class _80_Book extends _80_LibraryItem{
    private String isbn;

    public _80_Book(int id, String title, String author, String isbn) {
        super(id, title, author);
        this.isbn = isbn;
    }
}
