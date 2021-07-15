package com.Linklist;

import java.util.*;

public class MainList {
	// main method
	public static void main(String[] args) {
		LinkList linkedList = new LinkList();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter your choice");
			System.out.println("1)Insert at first(push)");
			System.out.println("2)insert at particular index");
			System.out.println("3)print list");
			System.out.println("4)Delete at particular position");
			System.out.println("5)exit");
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
				linkedList.print();
				break;

			case 4:
				System.out.println("enter the index in which you have to delete element");
				int deletePosition = sc.nextInt();
				linkedList.popAtIndex(deletePosition);
				linkedList.print();
				break;

			case 5:
				System.exit(0);

			default:
				System.out.println("Invalid choice");
				break;
			}

		}

	}

}
