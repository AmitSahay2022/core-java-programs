package com.dsa;

public class Test1 {
    public static void main(String[] args) {
        DoubleLinkedList list=new DoubleLinkedList(7);
//        list.printList();
//        list.getHead();
//        list.getTail();
//        list.getLength();
        //----------------------
        list.append(5);
        list.append(9);
//        list.getHead();
//        list.getTail();
//        list.printList();
//        list.getLength();
//        list.removeLast();

        System.out.println("---------------------------");

        list.add(1,4);
        list.add(1,8);
        list.printList();
        list.getLength();
//        list.get(5);
        list.add(3,3);
        list.prepend(15);
        list.printList();
//        list.delete(3);
//        list.printList();
//        list.removeFirst();
//        list.printList();
    }
}
