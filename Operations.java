package com.blz.linkedlist;

public class Operations {

	public static Object[] insertInBetween() {
		LinkedList linkedList = new LinkedList();
	    Node secondNode = linkedList.push(70);
	    Node firstNode = linkedList.push(56);
	    Node newNode= new Node(30);
	    System.out.println("Before:");
	    linkedList.print();
	    linkedList.insertInBetween(firstNode, newNode);
	    System.out.println("after:");
		return null;
	}
}
