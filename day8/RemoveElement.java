package com.test.day8;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveElement {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101, "Shubham", 26712));
		list.add(new Employee(121, "Nikita", 36958));
		list.add(new Employee(111, "Vaibhav", 58021));
		list.add(new Employee(118, "Raj", 14250));
		Iterator<Employee> itr = list.iterator();
		while (itr.hasNext()) {
			Employee emp = itr.next();
			if (emp.getName().equals("Raj")) {
				itr.remove();
			}
		}
		
			System.out.println(list);
		
	}
}
