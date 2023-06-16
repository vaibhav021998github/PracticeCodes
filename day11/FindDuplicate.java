package com.test.day11;

import java.util.HashSet;

public class FindDuplicate {
	public static void main(String[] args) {
		String s = "rajaram";
		char[] c = s.toCharArray();
		HashSet<Character> hs = new HashSet<>();
		for (int i = 0; i < c.length; i++) {
			for (int j = i+1; j < c.length; j++) {
				if (c[i] == c[j]) {
					hs.add(c[i]);
				}
			}
		}
		System.out.println("Duplicate in a given String"+hs);
	}
}
