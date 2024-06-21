package com.bro.code;

import java.util.LinkedList;

public class LinkedListt {

	public static void main(String[] args) {
		
		LinkedList<Integer>linkedlist=new LinkedList<>();
		linkedlist.push(2);
		linkedlist.push(4);
		linkedlist.push(5);
		linkedlist.push(8);
		linkedlist.pop();
		linkedlist.pop();
		linkedlist.pop();
		linkedlist.add(1,3);
		linkedlist.add(2,3);
		linkedlist.add(3,3);

		
		
		System.out.println(linkedlist);
	}
}
