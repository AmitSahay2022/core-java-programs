package com.sahay.dsa;

public class MyLinkedList {
	private Node head;
	private Node tail;
	private int length;
	
	class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	public MyLinkedList(int value) {
		Node newNode=new Node(value);
		head=newNode;
		tail=newNode;
		length=1;
		
	}
	
	public void printList() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.value+" ");
			temp=temp.next;
		}
	}
	public void getHead() {
		System.out.println("Head: "+head.value);
	}
	public void getTail() {
		System.out.println("Tail: "+tail.value);
	}
	public void getLenght() {
		System.out.println("Lenght: "+length);
	}
	
	public void appent(int value) {
		Node newNode=new Node(value);
		if(length==0) {
			head=newNode;
			tail=newNode;
		}else {
			tail.next=newNode; 
			tail=newNode;
		}
		length++;
	}
	
	public Node removeLast() {
		if(length==0) return null;
		Node temp=head;
		Node pre=head;
		while(temp.next!=null) {
			pre=temp;
			temp=temp.next;
			
		}
		tail=pre;
		tail.next=null;
		length--;
		if(length==0) {
			head=null;
			tail=null;
		}
		return temp;
	}
	
	public void prepend(int value) {
		Node newNode=new Node(value);
		if(length==0) {
			head=newNode;
			tail=newNode;
		}else {
			newNode.next=head;
			head=newNode;
		}
		length++;
	}
	
	public Node removeFirst() {
		if(length==0) return null;
		Node temp=head;
		head=head.next;
		temp.next=null;
		length--;
		if(length==0) {
			
			tail=null;
		}
		return temp;
	}
	
	public Node get(int index) {
		if(index<0 || index>=length) return null;
		if(index==0) return head;
		if(index==length-1) return tail;
		Node temp=head;
		for(int i=0;i<index;i++) {
			temp=temp.next;
			
		}
		return temp;
	}
	
	public void add(int index,int value) {
		if(index<0 || index>length) return ;
		if(index==0) {
			prepend(value);
		}
		if(index==length) {
			appent(value);
		}
		
		Node newNode=new Node(value);
		Node prev = get(index-1);
		newNode.next=prev.next;
		prev.next=newNode;
		length++;
		
	}
	public boolean remove(int index) {
		if(index<0 || index>=length) return false;
		if(index==0) {
			removeFirst();
		}
		if(index==length-1) {
			removeLast();
		}
		Node prev = get(index-1);
		Node temp=prev.next;
		Node t=temp.next;
		prev.next=t;
		temp.next=null;
		length--;
		return true;
	}
	//---------Again need to understand the logic------------
	public void reverse() {
		Node temp=head;
		head=tail;
		tail=temp;
		
		Node before=null;
		Node after=temp.next;
		for(int i=0;i<length;i++) {
			after=temp.next;
			temp.next=before;
			before=temp;
			temp=after;
		}
	}

}
