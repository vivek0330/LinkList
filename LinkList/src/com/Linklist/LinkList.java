package com.Linklist;

import com.Linklist.MainList;

public class LinkList {
	//creating head node 
	Node head;

	class Node{
		Node next;
		int data;

	
		//constructor 
		public Node(int data) {
			super();
			this.next = next;
			this.data = data;
		}
	}
	public Node tail=null;
	
	
	// uc2 :method to append data(insert at last position)
	public Node insert(int data) 
	{	
		 Node newNode = new Node(data);
		 if (head == null) 
		 {
			 head = newNode;
		 } 
		 else
		 {
			 Node temp = head;				 
			 while (temp.next != null) 
			 {
			 temp = temp.next;
			 }
			 temp.next = newNode;
		 }
		 return newNode;
	 }
	
	//uc1 and uc3 method to push(Insertion at head node)
	public void push(int data) 
	 {
		 Node newNode = new Node(data);
		 newNode.next = head;
		 head = newNode;
	 }
	
	//uc 4method to insert at particular position or after position
	public void addAtIndex(int value, int index) {
		if (index == 0) {
			insert(value);
		} else {
			Node  newNode = new Node(value);
			//newNode.value = value;
			Node nodeAtPreviousIndex = head;
			for (int i = 0; i < index - 1; i++) {
				nodeAtPreviousIndex = nodeAtPreviousIndex.next;
			}
			newNode.next = nodeAtPreviousIndex.next;
			nodeAtPreviousIndex.next = newNode;
		}
	}
	//uc5 delete the first element in the linklist
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

	//method for deleting last element of LinkList 
	public void popLast() {
		Node  currNode = head;
		Node  prevNode = head;
		while (currNode.next != null) {
			prevNode = currNode;
			currNode = currNode.next;
		}
		prevNode.next = null;
	}
	
	 public int search(int value) 
	 {
	 if (head == null) 
	 { 
		 System.out.println("List is Empty");
		 return -1;
	 }
	 int index = 1;
	 Node tempNode = head;
	 while (tempNode != null) 
	 {
		 if (tempNode.data == value) 
		 {
			break;
		 }
		 index++;
		 tempNode = tempNode.next;
	 }
	 return index;
	 }

	//method to Display LinkList
	public void print() 
	 {			 
		 Node temp = head;
		 while (temp != null)
		 {
			 System.out.print(temp.data + " -> ");
			 temp = temp.next;
		 }
		 System.out.println();
	 }
	
	
}
