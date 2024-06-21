package com.bro.code;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEg {
	public static void main(String[] args) {

		/*
		 * Queue = FIFO data structure First-In-First-Out(eg. A line ticket counter
		 * peoples) A collection designed for holding elements prior to processing
		 * Linear Data Structure
		 * 
		 * add = enqueue, offer() remove = dequeue , poll()
		 * 
		 */

		Queue<String> queue = new LinkedList<>();

		System.out.println(queue.isEmpty());

		queue.offer("Banana");//adding in queue
		queue.offer("Orange");
		queue.offer("Apple");
		queue.add("Greps");
		queue.add("Gua");
		queue.offer("Dragon");

		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.peek());

		System.out.println("is Queue empty: "+queue.isEmpty());
		System.out.println(queue.size());
		System.out.println(queue.contains("Banana"));
		System.out.println(queue.hashCode());
		System.out.println(queue.remove());
		

		queue.poll();//remove
		queue.poll();
		queue.poll();

		System.out.println(queue);

	}
}
