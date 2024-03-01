package org.example;

public class _56_OOPS_Create_Class_Book {
    private String title;
    private String author;
    private String isbn;
    private static int totalNoOfBooks=0;
    private boolean isBorrowed=false;
    public _56_OOPS_Create_Class_Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalNoOfBooks++;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
    public int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }
    public boolean borrowBook(){
        if(this.isBorrowed ==false) {
            System.out.println(this.title+ " : Enjoy the book");
            this.isBorrowed=true;
            return true;
        }else {
            System.out.println("Book is already Borrowed");
        }
        return false;

    }
    public boolean returnBook(){
        if(isBorrowed==true){
            System.out.println("Thanks for Returning......");
            isBorrowed=false;
            return true;
        }else {
            System.out.println("Book is already in library");
        }
        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("_56_OOPS_Create_Class_Book{");
        sb.append("title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", isbn='").append(isbn).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        _56_OOPS_Create_Class_Book book1=new _56_OOPS_Create_Class_Book("Core Java","Bhushan","12b3");
        _56_OOPS_Create_Class_Book book2=new _56_OOPS_Create_Class_Book("Spring Boot","Bhushan","342c");
        System.out.println(book1.getTotalNoOfBooks());
        book1.borrowBook();
        book1.borrowBook();
        book1.returnBook();
        book1.borrowBook();
    }
}
