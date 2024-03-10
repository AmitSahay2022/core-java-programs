package org.example.inheritance;

public class _80_Magazine extends _80_LibraryItem{
    private int issueNumber;
    public _80_Magazine(int id,String title,String author,int issueNumber){
        super(id, title, author);
        this.issueNumber=issueNumber;
    }
}
