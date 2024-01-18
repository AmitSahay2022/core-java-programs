package com.sahay.dsa;

public class Queue {
	private int length;
	private Node first;
	private Node last;
	
	class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	
	public Queue(int value) {
		Node newNode=new Node(value);
		first=newNode;
		last=newNode;
		length++;
	}
	public int getLength() {
		System.out.println(length);
		return length;
	}
	public int getFirst() {
		System.out.println(first.value);
		return first.value;
	}
	public int getLast() {
		System.out.println(last.value);
		return last.value;
	}
	public void printQueue() {
		Node temp=first;
		System.out.println("Queue is: ");
		while(temp!=null) {
			System.out.print(temp.value+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	//Method to add item in Queue
	public void enqueue(int value) {  
		Node newNode=new Node(value);
		if(length==0) {
			first=newNode;
			last=newNode;
		}else {
			Node temp=newNode;
			last.next=temp;
			last=temp;
		}
		length++;
	}
	public int dequeue() {
		Node temp=first;
		first=temp.next;
		temp.next=null;
		length--;
		System.out.println(temp.value+" is out of the Queue");
		return temp.value;
	}
	

}
