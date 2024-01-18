package com.sahay.dsa;

public class QueueTest {

	public static void main(String[] args) {
		Queue queue=new Queue(1);
		queue.enqueue(2);
		queue.enqueue(3);
//		queue.printQueue();
		queue.enqueue(4);
		queue.printQueue();
//		queue.getLength();
		queue.dequeue();
		queue.printQueue();
		queue.dequeue();

	}

}
