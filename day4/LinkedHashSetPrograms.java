package com.test.day4;

import java.util.LinkedHashSet;

public class LinkedHashSetPrograms {

	public static void main(String[] args) {
		// LinkedHashSet Program
		LinkedHashSet<String> linkedHashSet=new LinkedHashSet<String>();
		linkedHashSet.add("Vaibhav");
		linkedHashSet.add("Nikita");
		linkedHashSet.add("Shubham");
		linkedHashSet.add("Eshwari");
		linkedHashSet.add("Sakshi");
		linkedHashSet.add("Darshan");
		linkedHashSet.add("Siddhi");
		linkedHashSet.add(null);
		System.out.println(linkedHashSet);
		// here I observed that insertion order preserved and duplicates are not Allowed &
		//Also null insertion is possible
		

	}

}
