package com.Linklist;

import com.Linklist.MainList;

public class LinkList {
	// creating head node
	Node head;

	class Node {
		Node next;
		int data;

		// constructor
		public Node(int data) {
			super();
			this.next = next;
			this.data = data;
		}
	}

	public Node tail = null;

	public Node insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		return newNode;
	}

	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void addAtIndex(int value, int index) {
		if (index == 0) {
			insert(value);
		} else {
			Node newNode = new Node(value);
			// newNode.value = value;
			Node nodeAtPreviousIndex = head;
			for (int i = 0; i < index - 1; i++) {
				nodeAtPreviousIndex = nodeAtPreviousIndex.next;
			}
			newNode.next = nodeAtPreviousIndex.next;
			nodeAtPreviousIndex.next = newNode;
		}
	}
	
	public void  pop() 
	 {
		int popData = 0;
		if (head == null) 
		{
			System.out.println("Stack is empty");
		}
		 popData = head.data;
		 head = head.next;	
	 }

	// Delete at particular position
	public void popAtIndex(int index) {
		if (index == 0) {
			pop();
		} else {
			Node prevNode = head;
			Node currNode = head;
			for (int i = 0; i < index; i++) {
				prevNode = currNode;
				currNode = currNode.next;
			}
			prevNode.next = currNode.next;
		}
	}

	// method to Display LinkList
	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println();
	}

}
