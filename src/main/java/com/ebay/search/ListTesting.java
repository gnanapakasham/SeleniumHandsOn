package com.ebay.search;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListTesting {

	public static void main(String[] args) {

		int x;
		int[] myArr = new int[10];

		ArrayList<Integer> myArray = new ArrayList<>();

		myArray.add(0, 12);
		myArray.add(1, 13);
		myArray.add(2, 19);
		myArray.add(3, 18);
		myArray.add(4, 34);
		myArray.add(2, 39);
		myArray.add(4, 45);

		for (int i = 0; i < myArray.size(); i++) {

			System.out.println(" value " + myArray.get(i));
		}

		// Linked List
		LinkedList<Integer> linkedList = new LinkedList<>();

		linkedList.add(23);
		linkedList.add(1, 24);
		linkedList.add(2, 25);
		linkedList.add(3, 28);
		linkedList.add(4, 22);

		System.out.println("*******************************************************************");

		for (Integer temp : linkedList) {

			System.out.println(temp);
		}
	}
}
