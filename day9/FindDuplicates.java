package com.test.day9;

import java.util.HashSet;

public class FindDuplicates {

	public static void main(String[] args) {
		// Find the Duplicates From a string..
		String s = "Sangita";
		char[] c = s.toCharArray();
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					set.add(c[i]);
				}
			}
		}
		System.out.println("Duplicates in a given String : " + set);
	}

}
