package com.test.day3;

import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {
		// Check Anagram whether strings are anagram of each other...
		if(CheckAnagram("tr iang le","int eg ral")) {
			System.out.println("Given Strings are Anagrams");
		}else {
			System.out.println("Given Strings are not Anagrams");
		}
	}

	private static boolean CheckAnagram(String s1, String s2) {
		s1=s1.replaceAll(" ", "").toLowerCase();
		s2=s2.replaceAll(" ", "").toLowerCase();
		if(s1.length()!=s2.length()) {
			return false;
		}else {
			char a[]=s1.toCharArray();
			char b[]=s2.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
		return Arrays.equals(a, b);	
		}
		
	}

}
