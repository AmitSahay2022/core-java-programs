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
    public void prepend(int value){   //18-01-2024  OK
        Node newNode=new Node(value);
        newNode.next=head;
        head=newNode;
        length++;
    }
    public boolean add(int index,int value){  //18-01-2024  OK
        if(index<0 || index>length) return false;

        if(index==0){
            prepend(value);
            return true;
        }
        if (index==length) {
            append(value);
            return true;
        }


        Node newNode=new Node(value); //Created a Node

        Node before = getByIndex(index - 1); //Get previous node

        Node after=before.next;  //Currently before is pointing to after

        Node temp=newNode;
        temp.prev=before;
        temp.next=after;
        before.next=temp;
        after.prev=temp;


        length++;
        return true;
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
    public int removeFirst(){  //18-01-2024  OK
        Node temp=head;
        head= temp.next;
        temp.next=null;
        head.prev=null;
        length--;
        return temp.value;

    }
    private Node getByIndex(int index){  //18-01-2024   OK
        if(index<0 || index>=length) return null;
        if(index==0) return head;
        if(index==length-1) return tail;
        Node temp=head;
        int i=0;
        while (i<index){
            temp=temp.next;
            i++;
        }
        return temp;
    }
    public int get(int index){   //OK
        if(index>=length){
            System.out.println("Index out of bound!");
            return 0;
        }
        System.out.println(getByIndex(index).value);
        return getByIndex(index).value;
    }
    public boolean delete(int index){  //18-01-2024  OK
        //get previous node
        Node before = getByIndex(index - 1);
        Node temp=before.next;
        Node after=temp.next;
        before.next=after;
        after.prev=before;
        temp.next=null;
        temp.prev=null;
        length--;
        return true;
    }
}
