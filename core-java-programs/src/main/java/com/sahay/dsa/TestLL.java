package com.sahay.dsa;

import com.sahay.dsa.MyLinkedList.Node;

public class TestLL {

	public static void main(String[] args) {
		MyLinkedList list=new MyLinkedList(5);
		list.appent(4);
		list.appent(7);
		//list.getHead();
		//list.getTail();
		//list.getLenght();
		//list.printList();
		//Node removeLast = list.removeLast();
		//System.out.println();
		//list.printList();
		//list.prepend(2);
		//System.out.println();
		//list.printList();
		//System.out.println();
		//list.removeFirst();
		//list.removeFirst();
		
		//list.printList(); System.out.println();
		list.appent(6);
		list.appent(8);
		list.appent(2);
		//list.printList(); System.out.println();
		
		//System.out.println(list.get(2).value);
		//System.out.println();
		list.add(1, 5);
		//list.printList();
		//list.remove(1);
		//System.out.println();
		list.printList();System.out.println();
		list.reverse();
		System.out.println("After reverse");
		list.printList();
		
		

	}

}
