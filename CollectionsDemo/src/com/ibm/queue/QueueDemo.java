package com.ibm.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>();
		queue.add("1");
		queue.add("2");
		System.out.println(queue);
		queue.remove();
		System.out.println(queue);
		
	}
}
