package com.test.day4;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPrograms {

	public static void main(String[] args) {
		// LinkedList programs...
		LinkedList<String> list = new LinkedList<String>();
		list.add("Vaibhav");
		list.add("Nikita");
		list.add("Shubham");
		System.out.println(list);
		System.out.println("===================================");
		System.out.println(list.contains("Nikita"));
		System.out.println("===================================");
		// USE OF FOR LOOP
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("====================================");
		System.out.println("Using Iterator...");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("========================================");
		System.out.println(list.get(2));
	}

}
