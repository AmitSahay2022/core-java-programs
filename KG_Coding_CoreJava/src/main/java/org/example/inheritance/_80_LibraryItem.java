package org.example.inheritance;

public class _80_LibraryItem {
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;
    public _80_LibraryItem(int id,String title,String author){
        this.id=id;
        this.title=title;
        this.author=author;
        isAvailable=true;
    }
    public void checkout(){
        if(isAvailable){
            System.out.println("Enjoy "+this.title);
            isAvailable=false;
        }else {
            System.out.println("Book is not available!");
        }
    }
    public void returnItem(){
       if(isAvailable==false){
           System.out.println("Thanks for returning, Leave comments");
           isAvailable=true;
       }else {
           System.out.println("Book is already in library");
       }
    }
}
