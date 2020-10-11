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

	public void printStack() {
		myList.print();
	}

	public INode peak() {
		return myList.head;
	}

	public INode pop() {
		return myList.pop();
	}
}
