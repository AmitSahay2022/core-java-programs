package com.sahay.dsa;

public class Stack {
	private int height;
	private Node top;
	
	class Node{
		int value;
		Node next;
		public Node(int value) {
			this.value=value;
		}
	}
	public Stack(int value) {
		Node newNode=new Node(value);
		top=newNode;
		height=1;
	}
	public int getTop() {
		return top.value;
	}
	public int getHeight() {
		return height;
	}
	
	public void printStack() {
		System.out.println("Stack is: ");
		Node temp=top;
		while(temp!=null) {
			System.out.println(temp.value);
			temp=temp.next;
		}
	}
	public void push(int value) {
		Node newNode=new Node(value);
		if(height==0) {
			top=newNode;
		}else {
		newNode.next=top;
		top=newNode;
		}
		height++;
	}
	public int pop() {
		if(height==0) return 0;
		Node temp=top;
		top=temp.next;
		temp.next=null;
		height--;
		return temp.value;
	}

}
