package com.dsa;

public class Test1 {
    public static void main(String[] args) {
        DoubleLinkedList list=new DoubleLinkedList(7);
        list.printList();
        list.getHead();
        list.getTail();
        list.getLength();
        //----------------------
        list.append(5);
        list.append(9);
        list.getHead();
        list.getTail();
        list.printList();
        list.getLength();
        list.removeLast();
        list.printList();
    }
}
