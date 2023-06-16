package com.test.day3;

import java.util.HashSet;
import java.util.Set;

public class CommonCharacter {

	public static void main(String[] args) {
		// Find the Common Character of a String...
		String a = "abcdef";
		String b = "chefdi";
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < a.length(); j++) {
				if (a.charAt(i) == b.charAt(j)) {
					set.add(a.charAt(i) + " ");
				}
			}
		}
		System.out.println("Common Character :" + set);

	}

}
