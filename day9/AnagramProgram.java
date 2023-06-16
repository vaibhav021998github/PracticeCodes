package com.test.day9;

import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) {
		// check given strings are anagram or not
		System.out.println(checkAnagram("triangle","integral"));

	}

	private static boolean checkAnagram(String s1, String s2) {
		s1=s1.replace(" ", "").toLowerCase();
		s2=s2.replace(" ", "").toLowerCase();
		if(s1.length()!=s2.length())
		return false;
		else {
			char c1[]=s1.toCharArray();
			char c2[]=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			return Arrays.equals(c1, c2);
		}
	}

}
