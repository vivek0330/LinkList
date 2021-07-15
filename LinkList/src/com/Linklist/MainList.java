package com.Linklist;

import java.util.*;

public class MainList {

	public static void main(String[] args) {
		// main method
		LinkList linkedList = new LinkList();
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("Enter your choice\n1)Insert at first (push)\n" + "2)insert at particular index\n" + "3) Exit \n");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("enter data to insert(push)");
				int insertlast = sc.nextInt();
				linkedList.push(insertlast);
				linkedList.print();
				break;

			case 2:
				System.out.println("enter data to insert");
				int insertBetween = sc.nextInt();
				System.out.println("enter the index after which you have to enter data");
				int position = sc.nextInt();
				linkedList.addAtIndex(insertBetween, position);
				linkedList.print();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}

		}

	}
}
