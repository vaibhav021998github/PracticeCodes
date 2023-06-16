package com.test.day11;

import java.util.HashMap;

public class StringOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hii I am Vaibhav";
		s = s.replace(" ", "").toLowerCase();
		int counter;
		char[] c = s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < c.length; i++) {
			counter = 0;
			for (int j = 0; j < c.length; j++) {
				if (c[i] == c[j]) {
					counter++;
				}
				hm.put(c[i], counter);
			}
		}
		System.out.println("String Occurence: "+hm);
	}

}
