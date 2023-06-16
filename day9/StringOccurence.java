package com.test.day9;

import java.util.HashMap;

public class StringOccurence {

	public static void main(String[] args) {
		// Find the String Occurence program
		String a = " MS Dhoni";
		a = a.replace(" ", "").toLowerCase();
		int counter;
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		char[] c = a.toCharArray();
		for (int i = 0; i < c.length; i++) {
			counter = 0;
			for (int j = 0; j < c.length; j++) {
				if (c[i] == c[j]) {
					counter++;
				}
				hm.put(c[i], counter);
			}
		}
		System.out.println("String Occurence : " + hm);
	}

}
