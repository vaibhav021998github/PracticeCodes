package com.test.day10;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		// Find the Duplicate
		String s = "Vaibhav";
		char c[] = s.toLowerCase().toCharArray();
		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					set.add(c[i]);
				}
			}
		}
		System.out.println("Duplicate Characters are : " + set);

	}
}
