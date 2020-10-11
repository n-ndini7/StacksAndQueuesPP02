package com.capgemini;

import org.junit.Test;

import com.capgemini.INode;
import com.capgemini.MyStack;
import com.capgemini.Node;

import org.junit.Assert;

public class MyStackTest {

	@Test
	public void stackTestForPush() {
		System.out.println("This test is for pushing elements to the Stack.");
		Node<Integer> firstNode = new Node<>(70);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(56);
		MyStack myStack = new MyStack();
		myStack.push(firstNode);
		myStack.push(secondNode);
		myStack.push(thirdNode);
		myStack.printStack();
		INode peak = myStack.peak();
		Assert.assertEquals(thirdNode, peak);
	}

	@Test
	public void stackTestForPop() {
		System.out.println("This test is for popping elements from the Stack.");
		Node<Integer> firstNode = new Node<>(70);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(56);
		MyStack myStack = new MyStack();
		myStack.push(firstNode);
		myStack.push(secondNode);
		myStack.push(thirdNode);
		myStack.printStack();
		INode peak = myStack.peak();
		Assert.assertEquals(thirdNode, peak);
		INode temp = myStack.pop();
		myStack.printStack();
		Assert.assertEquals(thirdNode, temp);
	}
}
