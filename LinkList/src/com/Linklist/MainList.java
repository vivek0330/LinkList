package com.Linklist;

import java.util.LinkedList;

public class MainList {
	//main method
	public static void main(String[] args) {	
		createLinkList linkedList=new createLinkList();
		linkedList.append(70);
		linkedList.append(30);
		linkedList.append(56);
		System.out.println("LinkList:");
		linkedList.print();	
	}
}