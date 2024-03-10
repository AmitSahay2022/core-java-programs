package org.example.inheritance;

public class _80_Test {
    public static void main(String[] args) {
        _80_LibraryItem item1=new _80_Book(1,"core java","samsung","idbc43");
        _80_LibraryItem item2=new _80_DVD(1,"core java","samsung",43256);
        _80_LibraryItem item3=new _80_Magazine(1,"core java","samsung",541);
        item1.checkout();
        item1.checkout();
        item1.returnItem();
        item1.checkout();
    }
}
