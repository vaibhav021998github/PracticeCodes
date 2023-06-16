package com.test.day2;

public class PalindromeString {
	// Check whether given String is Palindrome or not...
	public static void main(String[] args) {
		String s = "Mam";
		s = s.toLowerCase();
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);//logic for reverse the String...
		}
		if (reverse.equals(s)) {
			System.out.println("String is Palindrome...");
		} else {
			System.out.println("String is not Palindrome...");
		}
	}
}
