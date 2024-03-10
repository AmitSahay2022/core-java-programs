package org.example.inheritance;

public class _80_DVD extends _80_LibraryItem{
    private int durationinseconds;

    public _80_DVD(int id, String title, String author, int durationinseconds) {
        super(id, title, author);
        this.durationinseconds = durationinseconds;
    }
}
