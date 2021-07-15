package com.Linklist;

import java.util.LinkedList;

public class MainList {
	//main method
	public static void main(String[] args) {	
		createLinkList linkedList=new createLinkList();
		linkedList.push(70);
		linkedList.push(30);
		linkedList.push(56);
		System.out.println("LinkList:");
		linkedList.print();	
	}
}