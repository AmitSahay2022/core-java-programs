package com.dsa;

public class DoubleLinkedList {
    private int length;
    private Node head;
    private Node tail;

    class Node{
        int value;
        Node prev;
        Node next;

       public Node(int value){
            this.value=value;
        }
    }
    public DoubleLinkedList(int value){
        Node newNode=new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }
    public void printList(){
        Node temp=head;
        System.out.print("List is: ");
        while (temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public int getLength(){
        System.out.println("Length: "+length);
        return length;
    }
    public Node getHead(){
        if(head!=null)
            System.out.println("Head: "+head.value);
        return head;
    }
    public Node getTail(){
        if(tail!=null)
            System.out.println("Tail: "+tail.value);
        return tail;
    }
    public void append(int value){
        Node newNode=new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        }
        else
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        length++;
    }
    public Node removeLast(){
        if(length==0) return null;

        Node temp=tail;
        tail=tail.prev;
        tail.next=null;
        temp.prev=null;
        length--;
        if(length==0){
            head=null;
            tail=null;
        }
        return temp;
    }
}
