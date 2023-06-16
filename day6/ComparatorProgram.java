package com.test.day6;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorProgram {

	public static void main(String[] args) {
		// Comparator Programs
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(21, "Vaibhav", 75.80));
		list.add(new Student(28, "Nikita", 75.60));
		list.add(new Student(32, "Shubham", 70.80));
		Collections.sort(list, new marksComparator());
		System.out.println(list);
	}

}
