package com.capgemini;

import com.capgemini.INode;

public class MyStack {

	private final LinkedList myList;

	public MyStack() {
		this.myList = new LinkedList();
	}

	public void push(INode myNode) {
		myList.add(myNode);
	}

	// create and add to the stack
	
	public INode peak() {
		return myList.head;
	}
	
	public void printStack() {
		myList.print();
	}

	// print the stack

}
