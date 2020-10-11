package com.capgemini;

import org.junit.Test;

import org.junit.Assert;

public class MyQueueTest {
	@Test
	public void enQueueTestforQueue() {
		MyQueue queue = new MyQueue();
		Node<Integer> firstNode = new Node<>(70);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(56);
		queue.enQueue(firstNode);
		queue.enQueue(secondNode);
		queue.enQueue(thirdNode);
		queue.printQueue();
		int size = queue.size();
		Assert.assertEquals(3, size);
	}

	@Test
	public void deQueueTestForQueue() {
		MyQueue queue = new MyQueue();
		Node<Integer> firstNode = new Node<>(70);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(56);
		queue.enQueue(firstNode);
		queue.enQueue(secondNode);
		queue.enQueue(thirdNode);
		INode<Integer> tempNode = queue.deQueue();
		queue.printQueue();
		Assert.assertEquals(firstNode, tempNode);
	}
}
