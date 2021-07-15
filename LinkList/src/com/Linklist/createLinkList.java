package com.Linklist;

public class createLinkList {
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
		//method to insert data in LinkList
		public Node insert(int data) {
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

		//method to push(Insertion at head node)
		public void push(int data) {
			 Node newNode = new Node(data);
			 newNode.next = head;
			 head = newNode;
		 }

		//method to Display LinkList
		public void print() {
			 Node temp = head;
			 while (temp != null)
			 {
				 System.out.print(temp.data + " -> ");
				 temp = temp.next;
			 }
			 System.out.println();
		 }
}
