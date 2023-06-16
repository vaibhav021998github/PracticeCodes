package com.test.day9;

import java.util.HashSet;
import java.util.Set;

public class CheckCommonCharacter {

	public static void main(String[] args) {
		// Check Common Character
		String a = "pqrst";
		
		String b = "pzxrt";
		
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < b.length(); j++) {
				if (a.charAt(i)==b.charAt(j)) {
					set.add(a.charAt(i) + " ");
				}
			}
		}
		System.out.println("Common Character are : " + set);
	}
}